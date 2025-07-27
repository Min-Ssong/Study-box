package generic.test.ex1;

public class ContainerTest {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("empty Check: " + stringContainer.isEmpty());

        stringContainer.setValue("data");
        System.out.println("check Data: " + stringContainer.getValue());
        System.out.println("empty Check2: " + stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setValue(10);
        System.out.println("check Data: " + integerContainer.getValue());
    }
}
