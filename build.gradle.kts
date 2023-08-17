// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

//    ext.hilt_version = '2.35' //- this is the stable version, but it doesn't work
//    Follow this page wich store all versions of DaggerHilt: https://github.com/google/dagger/releases

    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.45")
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}