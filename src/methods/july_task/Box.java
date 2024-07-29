package methods.july_task;

public class Box<T> {

    private T data;
    private final boolean isEven;

    public Box(T data, boolean isEven) {
        this.data = data;
        this.isEven = isEven;
    }

    public T getData() {
        return data;
    }

    public boolean isEven() {
        return isEven;
    }

    @Override
    public String toString() {
        return "Box{" +
                "data=" + data +
                ", isEven=" + isEven +
                '}';
    }
}
