plugins {
    alias(libs.plugins.looker.android.library)
    alias(libs.plugins.looker.hilt)
    alias(libs.plugins.looker.lint)
}

android {
    namespace = "com.looker.sync.fdroid"
}

dependencies {
    modules(
        Modules.coreCommon,
        Modules.coreDomain,
        Modules.coreNetwork,
    )

    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.fdroid.index)
    implementation(libs.fdroid.download)
    testImplementation(libs.junit4)
    androidTestImplementation(libs.androidx.test.ext)
    androidTestImplementation(libs.androidx.test.espresso.core)
}
