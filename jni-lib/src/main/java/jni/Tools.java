package jni;

public class Tools {
    static {
        if (!LibraryLoader.load(Tools.class, "tools"))
            System.loadLibrary("tools");
    }

    public String foo() {
        return "foo";
    }

    public native String bar();
}