#include <iostream>
#include "jni_Tools.h"

JNIEXPORT void JNICALL Java_jni_Tools_bar(JNIEnv *env, jobject thisObject)
{
  std::cout << "bar" << std::endl;
}