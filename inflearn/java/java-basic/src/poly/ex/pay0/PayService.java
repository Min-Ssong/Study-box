package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount){
        boolean result;
        System.out.println("Start pay: option = " + option + ", amount = " + amount);


        Pay pay;
        if(option.equals("kakao")){
            pay = new KakaoPay();
        } else if(option.equals("naver")){
            pay = new NaverPay();
        } else {
            System.out.println("Not found payment method");
        }

        result = pay.pay(amount);
        if(result){
            System.out.println("payment success");
        } else {
            System.out.println("payment fail");
        }
    }
}
