package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while( true ){
            System.out.println("1. product reg | 2.  product list | 3. exit");
            System.out.print("select menu: ");
            int selMenuNum = scanner.nextInt();
            scanner.nextLine();
            if(selMenuNum == 1){
                if(productCount == 9){
                    System.out.println("product list is full");
                    continue;
                }
                System.out.print("name:");
                productNames[productCount] = scanner.nextLine();
                System.out.print("price:");
                productPrices[productCount] = scanner.nextInt();
                productCount++;

            } else if(selMenuNum == 2){
                if(productCount == 0){
                    System.out.println("no product list");
                    continue;
                }
                for(int i = 0; i < productCount; i++){
                    System.out.println(productNames[i] + ": " + productPrices[i]);
                }
            } else {
                System.out.println("exit");
                break;
            }
        }
    }
}
