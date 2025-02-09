package poly.ex.pay0;

public class KakaoPay implements Pay{
    @Override
    public boolean pay(int amount){
        System.out.println("connecting KakaoPay System");
        System.out.println("pay for " + amount);
        return true;
    }
}
