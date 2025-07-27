package generic.ex2;

import generic.anaimal.Animal;
import generic.anaimal.Cat;
import generic.anaimal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 0);
        Dog dog = new Dog("Dog", 100);
        Cat cat = new Cat("Cat", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        animalBox.setValue(dog);
        animalBox.setValue(cat);
        Animal findAnimal = animalBox.getValue();
        System.out.println("findAnimal = " + findAnimal);
    }
}
