# JNI Project With Gradle 

A sample project setup/workflow for building JNI libraries (C++) with Gradle for references.

Features

* [Automatic JNI header generation](jni-lib/build.gradle#L24)
* [Load shared libraries embeded in Jar](jni-lib/src/main/java/jni/Tools.java#L5)
* [Unittest JNI with JUnit 5](jni-lib/build.gradle#L48)

Tested on

* Mac OS X
* Ubuntu (focal)

## Prerequisite

* OpenJDK 11+
* CMake 3.13+

## Building

Clone the repo

```sh
$ git clone https://github.com/stwind/gradle-jni.git
$ cd gradle-jni
$ ./gradlew run
```

The output should be something like

```
Downloading https://services.gradle.org/distributions/gradle-6.4-bin.zip
.........10%..........20%..........30%..........40%.........50%..........60%..........70%..........80%.........90%..........100%

Welcome to Gradle 6.4!

Here are the highlights of this release:
 - Support for building, testing and running Java Modules
 - Precompiled script plugins for Groovy DSL
 - Single dependency lock file per project

For more details see https://docs.gradle.org/6.4/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)

> Task :jni-lib:compileJNI
-- The CXX compiler identification is GNU 9.3.0
-- Check for working CXX compiler: /usr/bin/c++
-- Check for working CXX compiler: /usr/bin/c++ -- works
-- Detecting CXX compiler ABI info
-- Detecting CXX compiler ABI info - done
-- Detecting CXX compile features
-- Detecting CXX compile features - done
-- Found Java: /usr/lib/jvm/java-13-openjdk-amd64/bin/java (found version "13.0.3")
-- Found JNI: NotNeeded
-- Configuring done
-- Generating done
-- Build files have been written to: /root/gradle-jni/jni-lib/build/natives
Scanning dependencies of target tools
[ 50%] Building CXX object src/main/cpp/CMakeFiles/tools.dir/tools.cpp.o
[100%] Linking CXX shared library ../../../lib/libtools.so
[100%] Built target tools

> Task :jni-runner:run
foobar

BUILD SUCCESSFUL in 26s
6 actionable tasks: 6 executed
```

