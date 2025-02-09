package extends1.overriding;

public class ElectricCar extends Car {
    @Override
    public void move(){
        System.out.println("electricCar is fast move");
    }

    public void charge() {
        System.out.println("charging car");
    }
}
