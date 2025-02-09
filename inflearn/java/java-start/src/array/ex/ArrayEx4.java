package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;

        System.out.println("input "+numbers.length+" Numbers:");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        double average = (double) total / numbers.length;
        System.out.println("total: " + total);
        System.out.print("average: " + average);
    }
}
