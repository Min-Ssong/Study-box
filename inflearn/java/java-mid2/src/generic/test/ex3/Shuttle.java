package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
    private T t1;
    public void in(T t1) {
        this.t1 = t1;
    }

    public T out(){
        return this.t1;
    }

    public void showInfo(){
        System.out.println("name: " + t1.getName() + ", HP: " + t1.getHp());
    }
}
