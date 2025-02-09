package poly.ex4;


public class Dog extends AbstractAnimal {
    @Override
    public void sound(){
        System.out.println("dog sound");
    }

    @Override
    public void move() {
        System.out.println("dog move");
    }
}
