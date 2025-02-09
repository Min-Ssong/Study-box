package lang.immutable.address;

public class ImmutableObj {
    private final int value;

    public ImmutableObj add(int addValue){
        int result = value + addValue;
        return new ImmutableObj(result);
    }
    public int getValue() {
        return value;
    }

    public ImmutableObj(int value) {
        this.value = value;
    }
}
