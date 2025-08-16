package generic.ex5;

import generic.anaimal.Animal;
import generic.anaimal.Cat;
import generic.anaimal.Dog;

public class WildCardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox);
//        writeBox(catBox);

        Animal animal = animalBox.getValue();
        System.out.println("animal = " + animal);
    }

    private static void writeBox(Box<? super Animal> box) {
        box.setValue(new Dog("Dog", 100));
    }
}
