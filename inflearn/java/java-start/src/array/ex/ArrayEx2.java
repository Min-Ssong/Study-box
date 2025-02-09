package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("input "+numbers.length+" Numbers:");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        String msg = "";
        for(int i = 0; i < numbers.length; i++){
            msg += numbers[i];
            if(i != numbers.length-1){
                msg += ", ";
            }
        }
        System.out.print(msg);
    }
}
