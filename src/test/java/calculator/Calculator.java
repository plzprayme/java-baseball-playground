package calculator;

public class Calculator {

    public int calculate(String expr) {
        int result = 0;
        char op = '+';

        for (String e : expr.split(" ")) {
            try {
                int num = Integer.parseInt(e);
                result = calculate(result, op, num);
            } catch (NumberFormatException exception) {
                op = e.charAt(0);
            }
        }

        return result;
    }

    private int calculate(int result, char op, int num) {
        switch (op) {
            case '+': return result + num;
            case '-': return result - num;
            case '/': return result / num;
            case '*': return result * num;
            default:
                throw new IllegalArgumentException("사칙 연산만 가능합니다");
        }
    }
}
