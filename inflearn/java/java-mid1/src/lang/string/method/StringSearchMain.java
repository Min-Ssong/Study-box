package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";
        System.out.println("Str in Java : " + str.contains("Java"));
        System.out.println("Java first index : " + str.indexOf("Java"));
        System.out.println("start 10 to Java index : " + str.indexOf("Java", 10));
        System.out.println("last index of Java : " + str.lastIndexOf("Java") );
    }
}
