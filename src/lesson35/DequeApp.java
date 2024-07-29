package lesson35;

import java.util.Arrays;
import java.util.Deque;

public class DequeApp {

    public static void main(String[] args) {
        Operation[] values = Operation.values();
        System.out.println(Arrays.toString(values));
    }

    public enum Operation{

        END,

        UNDO,

        REDO,

        HOME,

        ENTER,

        RENAME,

        DELETE
    }

    public static Operation getOperation(){
        final int random = (int)(Math.random() * Operation.values().length);
        return Operation.values()[random];
    }

}
