package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        while( true ){
            if( num % 2 == 0 ){
                System.out.println(num++);
                count++;
                if(count == 10){
                    break;
                }
                continue;
            }
            num++;
        }
    }
}
