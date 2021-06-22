package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Expression {
    private static final String delimiter = " ";
    private static final String NUMBER = "^[0-9]$";
    private static final String OPERATOR = "^(\\+|\\-|\\*|/)$";
    private static final int NEXT = 1;
    private static final int FIRST = 0;

    private List<Number> numbers;
    private List<Operator> operators;

    public Expression(String expr) {
        String[] a = expr.split(delimiter);
        numbers = extractNumbers(a);
        operators = extractOperators(a);
    }

    private List<Number> extractNumbers(String[] a) {
        return Arrays.stream(a)
            .filter(this::isNumber)
            .map(Number::new)
            .collect(Collectors.toList());
    }

    private List<Operator> extractOperators(String[] a) {
        return Arrays.stream(a)
            .filter(this::isOperator)
            .map(Operator::new)
            .collect(Collectors.toList());
    }

    private boolean isNumber(String s) {
        return s.matches(NUMBER);
    }

    private boolean isOperator(String s) {
        return s.matches(OPERATOR);
    }

    public Number calculate() {
        Number result = numbers.get(FIRST);

        for (int i = 0; i < operators.size(); i++) {
            Operator op = operators.get(i);
            Number right = numbers.get(i + NEXT);
            result = op.calculate(result, right);
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Expression)) {
            return false;
        }

        Expression expr = (Expression)o;

        return expr.numbers.equals(numbers) &&
            expr.operators.equals(operators);
    }
}
