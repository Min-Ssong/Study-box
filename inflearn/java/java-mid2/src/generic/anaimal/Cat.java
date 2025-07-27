package generic.anaimal;

public class Cat extends Animal{
    public Cat(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("Cat Crying");
    }
}
