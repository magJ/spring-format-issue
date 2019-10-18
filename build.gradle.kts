plugins {
    java
}
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("io.spring.javaformat:spring-javaformat-gradle-plugin:0.0.15") {
            // Exclude shaded runtime as it causes all kinds of class loading issues with other plugins
            exclude(module = "spring-javaformat-formatter-eclipse-runtime")
        }
        classpath(
                group = "org.eclipse.jdt",
                name = "org.eclipse.jdt.core",
                //version = "3.17.0" // Works
                version = "3.18.0" // Doesn't work, nor does 3.19.0
        )
    }
}

apply(plugin = "io.spring.javaformat")