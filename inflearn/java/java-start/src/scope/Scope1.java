package scope;

import java.util.Arrays;
import java.util.Scanner;

public class Scope1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while( true ){
            System.out.println("1: input product, 2: payment, 3: exit");
            int input = scanner.nextInt();
            scanner.nextLine();
            if( input == 3 ) break;

            if(input == 1){
                System.out.print("name: ");
                String name = scanner.nextLine();

                System.out.print("price: ");
                int price = scanner.nextInt();
                scanner.nextLine();

                System.out.print("quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                sum += (quantity * price);
                System.out.println("name:" + name +  " price:" + price + " quantity:" + quantity + " sum:" + (quantity * price));
            } else if(input == 2){
                System.out.println("sum: " + sum);
                sum = 0;
            } else {
                System.out.println("This is not good input");
            }
        }
        System.out.println("exit");
    }
}
