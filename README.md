### Steps to run example
https://drive.google.com/file/d/162av9zH0acNyKg2BWmx7UeWdsWucFz_A/view?usp=sharing
* Download and extract the zip file.
* Run `npm install` to install the app dependencies in the unzipped directory.
* Navigate to `./App.tsx` and enter your App ID and token that we generated as `appId: 'YourAppId', token: 'YourChannelToken'`
* Open a terminal and execute `cd ios && pod install`.
* Connect your device and run `npx react-native run-android` or `npx react-native run-ios` to start the app.

The app uses `channel-x` as the channel name.

## Android
* Copy .aar and jar file SDK archive into libs dir:
 banuba_effect_player-release.aar => android/app/libs/
 banuba-agora-plugin-release.aar => android/app/libs/
 agora-rtc-sdk.jar => android/app/libs/
* Copy architecture folders from the Agora Video SDK archive into jniLibs dir: arm64-v8a, armeabi-v7a and x86_64 => android/app/src/main/jniLibs/
* Add your local Face AR effects to app/src/main/assets/effects
* Copy and Paste your Banuba client token, agora token, app and chanel ID in app/src/main/java/com/videoarpoc/ClientToken.kt 
* Run project

## iOS
* Open the .xcodeproj file in Xcode and delete the Banuba items from «General->Frameworks, Libraries, and Embedded Content» (do not delete AgoraRtcKit framework), and from the Frameworks folder in the project structure.
* Put the BanubaEffectPlayer.xcframework and BanubaFiltersAgoraExtension.framework to the “Frameworks, Libraries, and Embedded Content” section in your project.
* Copy and Paste your Banuba client token, agora token, app and chanel ID into the appropriate section of Token.swift with “ ” symbols. For example: 
 let banubaClientToken = "Banuba Token".
* Run project
