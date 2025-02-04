# AndroidApp-QuickCash

## Overview

AndroidApp-QuickCash is a mobile application designed to connect users with short-term job opportunities or "quick cash" tasks. Users can publish tasks they need help with, and nearby users can view and choose to take the tasks to earn money. This application allows for easy task management, user interaction, and location-based services.

## Getting Started

These instructions will help you set up the project on your local machine for development and testing purposes.

### Running Devices
- Nexus 5 API 24 (or any other device or emulator with Android 5.0+)

### Technology Stack

- [Java](https://www.oracle.com/java/)
- [Android Studio](https://developer.android.com/studio)
- [SQLite](https://www.sqlite.org/) - For local data storage
- [Firebase](https://firebase.google.com/docs) - For user authentication, real-time database, and cloud functions
- [Google Maps API](https://developers.google.com/maps/documentation/android-sdk/start) - For location-based task assignments

### Architecture

- **MVC (Model-View-Controller)**: The app follows the Model-View-Controller architecture to manage the interaction between the user interface, data, and business logic.

### Features

- **Task Publishing**: Users can create and publish tasks with descriptions, locations, and required payment.
- **Task Discovery**: Nearby users can view available tasks, filter tasks based on distance and type, and select the ones they want to complete.
- **Task Completion and Payment**: Upon completing a task, users can mark it as done, and payments are transferred through integrated payment methods.
- **Real-time Updates**: Task statuses, user actions, and updates are synchronized using Firebase's real-time database.
- **User Profiles**: Users can create profiles, view their task history, and manage their personal information.
- **Location-based Services**: Using Google Maps API, users can search for tasks based on proximity.

### Testing

- **JUnit**: For unit testing and integration testing.
- **Espresso**: For UI testing to ensure a smooth user experience.

### Running

1. **Install Android Studio**: Download and install [Android Studio](https://developer.android.com/studio) if you haven't already.
2. **Open the Project in Android Studio**:
   - Open the `AndroidApp-QuickCash` project in Android Studio.
3. **Sync the Project**:
   - Once opened, go to **File > Sync Project with Gradle Files** to sync dependencies.
4. **Run the Application**:
   - After syncing, you can run the app on a physical device or an emulator from Android Studio.

