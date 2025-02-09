package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        System.out.println("Animal Sound Test Start");
        dog.sound();
        System.out.println("Animal Sound Test End");
        System.out.println("Animal Sound Test Start");
        cat.sound();
        System.out.println("Animal Sound Test End");
        System.out.println("Animal Sound Test Start");
        caw.sound();
        System.out.println("Animal Sound Test End");
    }
}
