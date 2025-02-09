package oop;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("final value : " + valueData.value);
    }

    static void add(ValueData valueData){
        valueData.value++;
        System.out.println("Increase value = " + valueData.value);
    }
}
