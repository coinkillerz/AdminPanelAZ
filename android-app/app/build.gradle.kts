plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    dependencies {
        implementation("androidx.activity:activity-ktx:1.10.1")
    }
}

android {
    namespace = "com.coinkillerz.adminpanelaz"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.coinkillerz.adminpanelaz"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}
