package generic.ex3;

import generic.anaimal.Animal;

public class AnimalHospitalV2<T> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
        animal.toString();
        animal.equals(null);
    }

    public Animal getBigger(Animal target){
        return null;
    }
}
