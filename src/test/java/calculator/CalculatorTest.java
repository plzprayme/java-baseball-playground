package calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void calculate1() {
        String expr = "1 + 2";
        Calculator calculator = new Calculator();
        int actual = calculator.calculate(expr);
        assertThat(actual).isEqualTo(3);
    }

    @Test
    public void calculate2() {
        String expr = "2 + 3 * 4 / 2";
        Calculator calculator = new Calculator();
        int actual = calculator.calculate(expr);
        assertThat(actual).isEqualTo(10);
    }


}