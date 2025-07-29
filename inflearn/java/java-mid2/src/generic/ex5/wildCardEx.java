package generic.ex5;

import generic.anaimal.Animal;

public class wildCardEx {
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.getValue());
    }

    static void printWildCardV1(Box<?> box){
        System.out.println("? = " + box.getValue());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.getValue();
        System.out.println("Name = " + t.getName());
    }

    static void printWildCardV2(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("Name = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.getValue();
        System.out.println("Name = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildCCard(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("Name = " + animal.getName());
        return animal;
    }
}
