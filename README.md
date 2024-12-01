Weather App
Overview
The Weather App is an Android application that provides real-time weather updates using the OpenWeather API. Built with clean architecture principles, the app leverages modern Android development tools and libraries to ensure efficiency, maintainability, and a smooth user experience.

🚀 How to Run the App
Follow these steps to set up and run the app on your local machine:

Clone the Repository:

Copy the repository link from the Code button on GitHub.
Open Android Studio and choose File > New > Project from Version Control.
Paste the repository link and click Clone.
Set Up the Project:

Open the project in Android Studio.
Sync all Gradle files by clicking Sync Project with Gradle Files.
Clean the project using Build > Clean Project.
Build the project using Build > Rebuild Project.
Debug or run the app on your preferred device by clicking the Run button or pressing Shift + F10.
🤔 Why I Made the Choices I Did
The app is built using modern Android development practices to ensure clean, scalable, and maintainable code:

MVVM Architecture:

For separation of concerns and cleaner code.
Makes the code more testable and easier to maintain.
Retrofit:

To fetch weather data from the OpenWeather API with minimal effort and maximum efficiency.
Room Database:

To cache weather information locally, enabling the app to function even in offline mode.
Hilt (Dependency Injection):

To reduce boilerplate code and manage dependencies more efficiently.
Kotlin Coroutines:

To handle asynchronous tasks such as API calls and database operations without blocking the main thread.
🛠️ Tools and Technologies Used
Kotlin: The primary programming language.
Retrofit: For API integration.
Room Database: For local data storage and caching.
Hilt: For dependency injection.
Coroutines: For handling asynchronous operations.
MVVM Architecture: To keep the code modular and clean.

SS for the app



