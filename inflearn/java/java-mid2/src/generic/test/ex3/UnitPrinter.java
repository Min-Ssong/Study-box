package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter<T extends BioUnit> {
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle){
        T t1 = shuttle.out();
        System.out.println("name: " + t1.getName() + ", HP: " + t1.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle){
        BioUnit t1 = shuttle.out();
        System.out.println("name: " + t1.getName() + ", HP: " + t1.getHp());
    }
}
