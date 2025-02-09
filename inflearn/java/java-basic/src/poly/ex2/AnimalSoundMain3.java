package poly.ex2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal){
        System.out.println("Animal sound test start");
        animal.sound();
        System.out.println("Animal sound test end");
    }
}
