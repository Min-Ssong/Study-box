package generic.ex3;

import generic.anaimal.Cat;
import generic.anaimal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("Dog1", 100);
        Cat cat = new Cat("Cat1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        catHospital.setAnimal(cat);
        catHospital.checkUp();

        Dog biggerDog = dogHospital.bigger(new Dog("dog2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
