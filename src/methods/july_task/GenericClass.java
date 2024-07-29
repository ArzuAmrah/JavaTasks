package methods.july_task;

public class GenericClass <T> {
    private T value;

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "value=" + value +
                '}';
    }
}
