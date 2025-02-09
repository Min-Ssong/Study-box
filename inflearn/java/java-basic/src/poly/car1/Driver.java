package poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("Setting Car : " + car);
        this.car = car;
    }

    public void drive(){
        System.out.println("drive Car");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
