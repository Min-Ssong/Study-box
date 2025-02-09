package static1.ex;

public class Car {
    private String name;
    private static int count;

    public Car(String name) {
        this.name = name;
        count++;
        System.out.println("Buy The Car, Name : " + name);
    }


    public static void showTotalCars() {
        System.out.println("Buy Car count : " + count);
    }
}
