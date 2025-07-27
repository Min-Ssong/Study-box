package generic.ex2;

import generic.anaimal.Animal;
import generic.anaimal.Cat;
import generic.anaimal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 0);
        Dog dog = new Dog("Dog", 100);
        Cat cat = new Cat("Cat", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog);
        Dog findDog = dogBox.getValue();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);
        Cat findCat = catBox.getValue();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        Animal findAnimal = animalBox.getValue();
        System.out.println("findAnimal = " + findAnimal);
    }
}
