package nested.nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
        System.out.println(model + " Start ok");
    }

    public class Engine {
        public void start(){
            System.out.println("carge lever check : " + chargeLevel);
            System.out.println(model + " start");
        }
    }
}
