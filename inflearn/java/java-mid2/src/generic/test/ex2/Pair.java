package generic.test.ex2;

public class Pair<V1, V2> {
    private V1 first;
    private V2 second;

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public V1 getFirst() {
        return first;
    }

    public void setFirst(V1 first) {
        this.first = first;
    }

    public V2 getSecond() {
        return second;
    }

    public void setSecond(V2 second) {
        this.second = second;
    }
}
