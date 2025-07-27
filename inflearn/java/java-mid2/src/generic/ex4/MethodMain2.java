package generic.ex4;

import generic.anaimal.Cat;
import generic.anaimal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog1", 100);
        Cat cat = new Cat("Cat1", 300);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("Big Dog", 200);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
