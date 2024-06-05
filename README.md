<h1> Video Calling App using Jetpack Compose and MVI</h1>

This repository contains a Video Calling App built using Jetpack Compose and the Model-View-Intent (MVI) architecture. The project demonstrates modern Android development practices with a focus on building a fully functional video-calling feature.

<h1>Features</h1>

- Video calling functionality using Stream's video SDK.

- MVI architecture for unidirectional data flow and state management.

- Dependency injection using Koin.

- Kotlin Serialization for efficient data parsing.

- Jetpack Compose for building the UI. 

- Navigation component for managing in-app navigation.

- Unit and UI testing support.

<h1>Getting Started<h1>

<h1>Prerequisites</h1>

<h1>Ensure you have the following installed:</h1>

- Android Studio

- Kotlin 1.9.0

- Gradle 8.1.2
 
- Cloning the Repository

- Bash

- git clone https://github.com/kyodgorbek/videocallingapp.git 

- cd videocallingapp

  <h1>Building the Project<h1/>

 - Open the project in Android Studio and sync the project with Gradle.
 -  Make sure to build the project to download all necessary dependencies.

<h1> Running the App<h1/>

-  Connect your Android device or start an emulator
-  and run the app from Android Studio.

<h1> Technologies Used<h1/>

- Android Gradle Plugin (AGP) - Version: 8.1.2
- Kotlin - Version: 1.9.0

<h1> Jetpack Libraries</h1>

- Core KTX: androidx.core:core-ktx:1.13.1
- Lifecycle Runtime KTX: androidx.lifecycle:lifecycle-runtime-ktx:2.8.0
- Activity Compose: androidx.activity:activity-compose:1.9.0
- Compose BOM: androidx.compose:compose-bom:2023.08.00
- Compose UI: androidx.compose.ui:ui
- Compose UI Graphics: androidx.compose.ui:ui-graphics
- Compose UI Tooling: androidx.compose.ui:ui-tooling
- Compose UI Tooling Preview: androidx.compose.ui:ui-tooling-preview
- Compose UI Test Manifest: androidx.compose.ui:ui-test-manifest
- Compose UI Test JUnit4: androidx.compose.ui:ui-test-junit4
- Material3: androidx.compose.material3:material3
- Navigation Compose: androidx.navigation:navigation-compose:2.8.0-beta01

 <h1>Testing Libraries<h1/>

- JUnit: junit:junit:4.13.2
- AndroidX JUnit: androidx.test.ext:junit:1.1.5
- Espresso Core: androidx.test.espresso:espresso-core:3.5.1

 <h1> Stream SDK </h1>

- Stream Video Core: io.getstream:stream-video-android-core:0.5.8

- Stream Video UI Compose: io.getstream:stream-video-android-ui-compose:0.5.8

<h1> Koin for Dependency Injection</h1>

- Koin Core: io.insert-koin:koin-core:3.5.3

- Koin Android: io.insert-koin:koin-android:3.5.3

- Koin AndroidX Compose: io.insert-koin:koin-androidx-compose:3.5.3

<h1>Kotlin Serialization</h1>

Kotlinx Serialization JSON: org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3

<h1>Project Structure</h1>

The project follows a modular approach with the following structure:

- app: Contains the main application logic.
- connect: Contains connection logic.
- video: Contains video call logic.
- ui: Comprises all UI-related code including Compose components.
- di: Contains dependency injection modules.

<h1>Usage<h1/>

<h1>To use the app, follow these steps</h1>

- Clone the repository.
- Open it in Android Studio.
- Sync and build the project.
- Run the app on an emulator or a real device.

<h1>Contributions</h1>

Contributions are welcome! Please submit a pull request or open an issue to discuss any changes.

<h1>License</h1>
This project is licensed under the MIT License - see the LICENSE file for details.

<h1>Acknowledgements</h1>

- Jetpack Compose team for providing a modern UI toolkit.
- Stream for their robust video SDK.
- Koin for making dependency injection simple and effective.

                                                            Happy coding!
