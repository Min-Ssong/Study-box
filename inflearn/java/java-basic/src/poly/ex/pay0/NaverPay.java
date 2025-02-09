package poly.ex.pay0;

public class NaverPay implements Pay{
    @Override
    public boolean pay(int amount){
        System.out.println("connecting NaverPay System");
        System.out.println("pay for " + amount);
        return true;
    }
}
