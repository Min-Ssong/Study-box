package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, JAva!";
        System.out.println("length : " + str.length());
        System.out.println("isEmpty : " + str.isEmpty());
        System.out.println("isBlank : " + str.isBlank());
        System.out.println("isBlank2 : " + "     ".isBlank());

        char c= str.charAt(7);
        System.out.println("c = " + c);
    }
}
