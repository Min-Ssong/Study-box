package lang.immutable.address;

public class MutableObj {
    private int value;

    public void add(int addValue){
        value = value + addValue;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public MutableObj(int value) {
        this.value = value;
    }
}
