package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input student numbers: ");
        int studentCount = scanner.nextInt();

        int[][] sungjuk = new int[studentCount][3];
        String[] object = {"Korean langauge", "English", "Math"};
        for(int i = 0; i < studentCount; i++){
            System.out.println((i + 1)+ " student :");
            for(int j = 0; j < 3; j++){
                System.out.print(object[j] + ": ");
                sungjuk[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < sungjuk.length; i++){
            int[] total = new int[studentCount];
            double[] average = new double[studentCount];
            for(int j = 0; j < sungjuk[i].length; j++){
                total[i] += sungjuk[i][j];
            }
            average[i] = (double)total[i] / 3;
            System.out.println((i+1) + " total: " + total[i] + " average: " + average[i]);
        }
    }
}
