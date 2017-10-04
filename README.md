
# Physical gestures

## Getting started

`$ npm install rn-ph-gestures --save`

### Mostly automatic installation

`$ react-native link rn-ph-gestures`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `rn-ph-gestures` and add `RNGestures.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNGestures.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<


## Usage
```javascript
import RNGestures from 'rn-ph-gestures';

//Registering Listener
RNGestures.registerMovementDetection(3, 2000);

//Unregistering Listener
 RNGestures.stopMovementDetection();

//Listening events
DeviceEventEmitter.addListener("MOVING", () => {
    // Do your stuff
});

DeviceEventEmitter.addListener("STATIONARY", () => {
    // Do your stuff
});
```
  