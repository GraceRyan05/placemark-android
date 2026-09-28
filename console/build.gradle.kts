plugins {
    alias(libs.plugins.android.application)
    //alias(libs.plugins.kotlin.android)
}

android {
    namespace = "org.setu.placemark"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.setu.placemark"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
}
