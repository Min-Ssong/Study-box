package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "won input. balance: " + balance + "won");

        int withdrawAmount = 2000;
        if(balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(depositAmount + "won output. balance: " + balance + "won");
        } else {
            System.out.println(depositAmount + "won try output. but no have balance");
        }

        System.out.println("balance: " + balance);
    }
}
