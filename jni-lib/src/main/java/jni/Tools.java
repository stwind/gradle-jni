package jni;

public class Tools {
    static {
        System.loadLibrary("tools");
    }

    public String foo() {
        return "foo";
    }

    public native String bar();
}