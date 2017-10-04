
# react-native-gestures

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

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNGesturesPackage;` to the imports at the top of the file
  - Add `new RNGesturesPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-gestures'
  	project(':react-native-gestures').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-gestures/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-gestures')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNGestures.sln` in `node_modules/rn-ph-gestures/windows/RNGestures.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Gestures.RNGestures;` to the usings at the top of the file
  - Add `new RNGesturesPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNGestures from 'rn-ph-gestures';

// TODO: What to do with the module?
RNGestures;
```
  