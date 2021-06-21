package calculator;

public class Number {
    private int number;

    public Number(String s) {
        number = Integer.parseInt(s);
    }

    public void plus(Number right) {
        number = number + right.number;
    }

    public void minus(Number right) {
        number = number - right.number;
    }

    public void divide(Number right) {
        number = number / right.number;
    }

    public void multiply(Number right) {
        number = number * right.number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Number)) {
            return false;
        }

        Number op = (Number) o;
        return op.number == number;
    }
}
