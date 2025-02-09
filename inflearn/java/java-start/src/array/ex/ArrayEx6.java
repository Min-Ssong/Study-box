package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input Number: ");
        int len = scanner.nextInt();

        int[] numbers = new int[len];
        int max = 0;
        int min = 0;
        System.out.println("input "+len+" Numbers:");
        for(int i = 0; i < len; i++){
            numbers[i] = scanner.nextInt();
            int number = numbers[i];
            if( i == 0 ){
                max = number;
                min = number;
            } else {
                max = ( max > number) ? number : max;
                max = ( min < number) ? number : min;
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
