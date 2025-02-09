package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] sungjuk = new int[4][3];
        for(int i = 0; i < 4; i++){
            System.out.println((i + 1)+ " student :");
            System.out.print("Korean langauge: ");
            sungjuk[i][0] = scanner.nextInt();

            System.out.print("English: ");
            sungjuk[i][1] = scanner.nextInt();

            System.out.print("Math: ");
            sungjuk[i][2] = scanner.nextInt();
        }

        for(int i = 0; i < sungjuk.length; i++){
            int[] total = new int[4];
            double[] average = new double[4];
            for(int j = 0; j < sungjuk[i].length; j++){
                total[i] += sungjuk[i][j];
            }
            average[i] = (double)total[i] / 3;
            System.out.println((i+1) + " total: " + total[i] + " average: " + average[i]);
        }
    }
}
