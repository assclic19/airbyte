plugins {
  id("io.airbyte.gradle.jvm.lib")
  id("io.airbyte.gradle.publish")
  kotlin("jvm")
  kotlin("kapt")
}

dependencies {
  kapt(platform(libs.micronaut.bom))
  kapt(libs.bundles.micronaut.annotation.processor)

  implementation(platform(libs.micronaut.bom))
  implementation(libs.micronaut.inject)
  implementation(libs.launchdarkly)
  implementation(libs.jackson.databind)
  implementation(libs.jackson.dataformat)
  implementation(libs.jackson.kotlin)

  kaptTest(platform(libs.micronaut.bom))
  kaptTest(libs.bundles.micronaut.test.annotation.processor)

  testImplementation(kotlin("test"))
  testImplementation(kotlin("test-junit5"))
  testImplementation(libs.bundles.micronaut.test)
  testImplementation(libs.mockk)
  testImplementation(libs.bundles.junit)
}
