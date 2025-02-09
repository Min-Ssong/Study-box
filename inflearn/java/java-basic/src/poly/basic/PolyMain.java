package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        Parent poly = new Child();
        poly.parentMethod();

        Child child = (Child) poly;
        child.childMethod();
    }
}
