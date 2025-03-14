# Course E-Commerce Android App

## Description

An Android e-commerce application for online courses, featuring a modern Material Design UI, course categorization, shopping cart functionality, and seamless course browsing experience.

## Features

- Course catalog with categories
- Horizontal scrolling course cards
- Category-based filtering
- Shopping cart functionality
- Detailed course pages
- Material Design implementation
- Responsive UI with animations
- Course level indicators
- Date-based organization

## Technical Stack

- **Language:** Java
- **Platform:** Android
- **Min SDK:** 21 (Android 5.0)
- **Target SDK:** 32
- **Build System:** Gradle
- **Architecture:** MVC pattern
- **UI Components:**
  - RecyclerView
  - CardView
  - ConstraintLayout
  - Custom Vectors

## Project Structure

```
e-comerse/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/trasty/e_comerse/
│   │   │   │   ├── adapter/
│   │   │   │   │   ├── CategoryAdapter.java
│   │   │   │   │   └── CourseAdapter.java
│   │   │   │   ├── model/
│   │   │   │   │   ├── Category.java
│   │   │   │   │   ├── Course.java
│   │   │   │   │   └── Order.java
│   │   │   │   ├── MainActivity.java
│   │   │   │   ├── CoursePage.java
│   │   │   │   └── OrderPage.java
│   │   │   └── res/
│   │   │       ├── layout/
│   │   │       ├── drawable/
│   │   │       └── values/
│   │   └── androidTest/
│   └── build.gradle
└── build.gradle
```

## Setup Instructions

### Prerequisites

- Android Studio Arctic Fox or later
- JDK 8
- Android SDK 32
- Gradle 6.5

### Installation

1. Clone the repository:

```bash
git clone [repository-url]
```

2. Open in Android Studio:

- File -> Open -> [project location]
- Let Gradle sync complete

3. Run the app:

- Select target device/emulator
- Click 'Run' (⇧F10)

## Usage

1. **Browse Courses:**

   - Scroll horizontally through course cards
   - Filter by category using top menu

2. **Course Details:**

   - Click on course card for detailed view
   - View course information and level

3. **Shopping Cart:**
   - Add courses to cart
   - View cart contents
   - Manage selected courses

## Architecture

- **Activities:**

  - MainActivity: Main course listing
  - CoursePage: Detailed course view
  - OrderPage: Shopping cart

- **Adapters:**

  - CategoryAdapter: Handles category display
  - CourseAdapter: Manages course cards

- **Models:**
  - Course: Course data structure
  - Category: Category information
  - Order: Shopping cart data

## Contributing

1. Fork the repository
2. Create feature branch
3. Commit changes
4. Push to branch
5. Create Pull Request

## Build Configuration

```gradle
android {
    compileSdkVersion 32
    buildToolsVersion "32.0.0"

    defaultConfig {
        minSdkVersion 21
        targetSdkVersion 32
        versionCode 1
        versionName "1.0"
    }
}
```

## Dependencies

```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.4.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
}
```

## Testing

Run automated tests:

```bash
./gradlew test
```

## License

[Specify License]

## Author

[Your Name]

## Acknowledgments

- Android Development Team
- Material Design Guidelines
- Open Source Community
