package jni;

public class Runner {
    public static void main(String[] args) {
        // Boolean res = LibraryLoader.load(Tools.class, "tools");
        // System.out.println(res);

        Tools tools = new Tools();
        System.out.println(tools.foo() + tools.bar());
    }
}