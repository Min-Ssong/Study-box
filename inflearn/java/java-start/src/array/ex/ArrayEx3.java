package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("input "+numbers.length+" Numbers:");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        String msg = "";
        for(int i = numbers.length - 1; i >= 0; i--){
            msg += numbers[i];
            if(i > 0){
                msg += ", ";
            }
        }
        System.out.print(msg);
    }
}
