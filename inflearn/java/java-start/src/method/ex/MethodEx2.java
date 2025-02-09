package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";

        repeatMsg(message, 3);
        repeatMsg(message, 5);
        repeatMsg(message, 7);
    }

    public static void repeatMsg(String msg, int count){
        for(int i = 0; i < count; i++){
            System.out.println(msg);
        }
    }
}
