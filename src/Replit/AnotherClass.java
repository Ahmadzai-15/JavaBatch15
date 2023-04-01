package Replit;

public class AnotherClass {
    private static String privateMethod() {
        return "private";
    }

    static String defaultMethod() {
        return "default";
    }

    protected static String protectedMethod() {
        return "protected";
    }

    public static String publicMethod() {
        return "public";
    }

    public static void main(String[] args) {
        System.out.println(AnotherClass.privateMethod()); // prints "private"
        System.out.println(AnotherClass.defaultMethod()); // prints "default"
        System.out.println(AnotherClass.protectedMethod()); // prints "protected"
        System.out.println(AnotherClass.publicMethod()); // prints "public"
    }
}
