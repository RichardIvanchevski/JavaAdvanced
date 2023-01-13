package GenericBoxString;

public class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",t.getClass().getName(),t.toString());
    }
}
