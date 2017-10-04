
package com.ireachm;


import android.util.Log;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.github.nisrulz.sensey.FlipDetector;
import com.github.nisrulz.sensey.MovementDetector;
import com.github.nisrulz.sensey.Sensey;

public class RNGesturesModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext context;


    private final String EVT_MOVING = "MOVING";
    private final String EVT_STATIONARY = "STATIONARY";

    private MovementDetector.MovementListener movementListener = null;


    public RNGesturesModule(ReactApplicationContext reactContext) {
        super(reactContext);
        context = reactContext;

        Sensey.getInstance().init(reactContext);

        reactContext.addLifecycleEventListener(new LifecycleEventListener() {
            @Override
            public void onHostResume() {

            }

            @Override
            public void onHostPause() {

            }

            @Override
            public void onHostDestroy() {
                Sensey.getInstance().stop();
            }
        });
    }


    @Override
    public String getName() {
        return "RNGestures";
    }



    @ReactMethod
    public void registerMovementDetection(Float threshold, Integer timeToBecomeStationary) {
        Log.d("DEBUG", "Starting movement detection");
        movementListener = new MovementDetector.MovementListener() {
            @Override
            public void onMovement() {
                emitEvent(EVT_MOVING, null);
            }

            @Override
            public void onStationary() {
                emitEvent(EVT_STATIONARY, null);
            }
        };
        Sensey.getInstance().startMovementDetection(threshold, timeToBecomeStationary, movementListener);
    }

    @ReactMethod
    public void stopMovementDetection() {
        Log.d("DEBUG", "Stoping movement detection");
        Sensey.getInstance().stopMovementDetection(movementListener);
    }


    //communicating the event back to JS
    public void emitEvent(String type, Object data) {
        context.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit(type, data);
    }
}