package generic.ex3;

import generic.anaimal.Cat;
import generic.anaimal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("Dog1", 100);
        Cat cat = new Cat("Cat1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        catHospital.setAnimal(cat);
        catHospital.checkUp();

        dogHospital.setAnimal(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("dog2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
