package generic.ex3;

import generic.anaimal.Animal;
import generic.anaimal.Cat;
import generic.anaimal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("Dog1", 100);
        Cat cat = new Cat("Cat1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        catHospital.setAnimal(cat);
        catHospital.checkUp();

        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("dog2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
