package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
//        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
//        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("send message: ");
            String input = sc.nextLine();
            if("exit".equals(input)){
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("program is end");
    }
}
