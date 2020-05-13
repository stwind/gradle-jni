package jni;

public class Runner {
    public static void main(String[] args) {
        Tools tools = new Tools();
        System.out.println(tools.foo() + tools.bar());
    }
}