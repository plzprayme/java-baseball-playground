package calculator;

public class Operator {
    public static final int FIRST = 0;
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char DIVIDE = '/';
    private static final char MULTIPLY = '*';

    private char operator;

    public Operator(String s) {
        operator = s.charAt(FIRST);
    }

    public Number calculate(Number left, Number right) {
        if (isPlus()) {
            left.plus(right);
        }

        if (isMinus()) {
            left.minus(right);
        }

        if (isDivide()) {
            left.divide(right);
        }

        if (isMultiply()) {
            left.multiply(right);
        }

        return left;
    }

    private boolean isPlus() {
        return operator == PLUS;
    }

    private boolean isMinus() {
        return operator == MINUS;
    }

    private boolean isDivide() {
        return operator == DIVIDE;
    }

    private boolean isMultiply() {
        return operator == MULTIPLY;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Operator)) {
            return false;
        }

        Operator op = (Operator) o;
        return op.operator == operator;
    }
}
