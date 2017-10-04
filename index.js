
import { NativeModules } from 'react-native';

const { RNGestures } = NativeModules;

export default RNGestures;

/*
USAGE

Registering Lsiteners :   RNGestures.registerMovementDetection(3, 2000);

Unregistering Events: RNGestures.stopMovementDetection();

DeviceEventEmitter.addListener("MOVING", () => {
    // Do Stuff
});

DeviceEventEmitter.addListener("STATIONARY", () => {
    // Do Stuff
});

*/
