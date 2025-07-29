package generic.ex5;

import generic.anaimal.Animal;
import generic.anaimal.Cat;
import generic.anaimal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.setValue(new Dog("Dog", 100));

        wildCardEx.printGenericV1(dogBox);
        wildCardEx.printWildCardV1(dogBox);
        wildCardEx.printGenericV2(dogBox);
        wildCardEx.printWildCardV2(dogBox);
        Dog dog = wildCardEx.printAndReturnGeneric(dogBox);
        Animal animal = wildCardEx.printAndReturnWildCCard(dogBox);
    }
}
