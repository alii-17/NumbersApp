# Numbers App - Android Assignment

## Project Overview
An Android application that displays numbers 1–10 using **RecyclerView**, **Data Binding**, and **ConstraintLayout**.

## Project Structure
```
app/
├── src/main/
│   ├── java/com/example/numbersapp/
│   │   ├── MainActivity.kt          ← Sets up RecyclerView with data
│   │   ├── NumberModel.kt           ← Data class (englishName, arabicName, imageResId)
│   │   ├── NumbersAdapter.kt        ← RecyclerView Adapter using Data Binding
│   │   └── BindingAdapters.kt       ← Custom BindingAdapter for ImageView
│   └── res/
│       ├── layout/
│       │   ├── activity_main.xml    ← Main layout with RecyclerView (Data Binding enabled)
│       │   └── item_number.xml      ← List item: ConstraintLayout + Data Binding variables
│       ├── drawable/                ← ⚠️ Add your number images here (see below)
│       └── values/
│           ├── strings.xml
│           ├── colors.xml
│           └── themes.xml
```

## Setup Steps

### 1. Add Image Assets (IMPORTANT)
Copy the provided number images into `app/src/main/res/drawable/` with these exact names:
- `number_one.png`
- `number_two.png`
- `number_three.png`
- `number_four.png`
- `number_five.png`
- `number_six.png`
- `number_seven.png`
- `number_eight.png`
- `number_nine.png`
- `number_ten.png`

> ⚠️ Note: The uploaded file `number_two.png` was not included in the assets provided.
> You'll need to create or find a "2" acorn image matching the style.

### 2. Open in Android Studio
- Open Android Studio → **Open** → Select the `NumbersApp` folder
- Wait for Gradle sync to finish

### 3. Build & Run
- Connect a device or start an emulator
- Click **Run ▶**

## Key Features
- ✅ **RecyclerView** with `LinearLayoutManager`
- ✅ **Data Binding** enabled (`buildFeatures { dataBinding true }`)
- ✅ **ConstraintLayout** for each list item
- ✅ `ImageView` on the left, 80dp × 80dp
- ✅ English name (e.g., "One") and Arabic name (e.g., "واحد") to the right
- ✅ Arabic TextView is below the English TextView
- ✅ All views properly constrained

## Requirements
- Android Studio Hedgehog or newer
- Min SDK: 24 (Android 7.0)
- Target SDK: 34 (Android 14)
- Kotlin 1.9.0
