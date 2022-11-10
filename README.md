# Dagger 2
Dagger is a fully static, compile-time dependency injection framework for Java, Kotlin, and Android.

## Add dagger 2 dependencies
 ```gradle
 plugins {
    id 'java'
}

group 'com.vkpapps'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'com.google.dagger:dagger:2.44'
    
    // dagger compiler
    annotationProcessor 'com.google.dagger:dagger-compiler:2.44'
}

```
