package generic.ex4;

import generic.anaimal.Animal;
import generic.anaimal.Cat;
import generic.anaimal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog1", 100);
        Cat cat = new Cat("Cat1", 300);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.setAnimal(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
