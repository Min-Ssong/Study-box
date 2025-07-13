package exception.ex4.exception;

import exception.ex3.NetworkServiceV3_2;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("send Message: ");
            String input = scanner.nextLine();
            if("exit".equals(input)){
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch(Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("program is exit");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("User Message: Sorry Unknown problem has occurred");
        System.out.println("==debugging message==");
        e.printStackTrace(System.out);

        if(e instanceof SendExceptionV4 sendEx) {
            System.out.println("[Send Error] send Data: " + sendEx.getSendData());
        }
    }
}