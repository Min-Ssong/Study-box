package nested.nested.inner.ex1;

public class Engine {
    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start(){
        System.out.println("carge lever check : " + car.getChargeLevel());
        System.out.println(car.getModel() + " start");
    }
}
