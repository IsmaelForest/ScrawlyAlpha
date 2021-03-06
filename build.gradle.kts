import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.13.1")
    implementation("junit:junit:4.13.1")
    testImplementation(kotlin("test"))

    // Use the Kotlin JUnit integration.
    implementation (group= "org.seleniumhq.selenium", name = "selenium-java", version =  "3.+" )

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")

    //Calendar
    implementation ("com.google.api-client:google-api-client:1.33.0")
    implementation ("com.google.oauth-client:google-oauth-client-jetty:1.32.1")
    implementation ("com.google.apis:google-api-services-calendar:v3-rev20211026-1.32.1")

}

tasks.test {
    useJUnitPlatform()

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}