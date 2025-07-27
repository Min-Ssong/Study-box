package generic.ex3;

import generic.anaimal.Cat;
import generic.anaimal.Dog;

public class CatHospital {
    private Cat animal;

    public void setAnimal(Cat animal) {
        this.animal = animal;
    }
    public void checkUp(){
        System.out.println("animal.getName() = " + animal.getName());
        System.out.println("animal.getSize() = " + animal.getSize());
        animal.sound();
    }

    public Cat getBigger(Cat target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
