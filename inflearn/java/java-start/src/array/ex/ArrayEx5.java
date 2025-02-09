package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input Number: ");
        int len = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[len];
        int total = 0;
        System.out.println("input "+len+" Numbers:");
        for(int i = 0; i < len; i++){
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        double average = (double) total / len;
        System.out.println("total: " + total);
        System.out.print("average: " + average);
    }
}
