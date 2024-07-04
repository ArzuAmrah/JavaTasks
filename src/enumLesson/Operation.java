package enumLesson;

public enum Operation {
    SUM,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    MODULUS,
    DEFAULT;

    private char c;

    Operation() {

    }

    Operation(char c) {
        this.c = c;
    }


    public static Operation getOperation(char c) {
        if (c == '+') return Operation.SUM;
        else if (c == '-') return Operation.SUBTRACT;
        else  return Operation.DEFAULT;

    }
}

