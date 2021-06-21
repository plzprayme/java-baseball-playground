package calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExpressionTest {

    @Test
    public void calculate1() {
        // given
        Expression expr = new Expression("1 + 2");
        Number expected = new Number("3");

        // when
        Number actual = expr.calculate();

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void calculate2() {
        // given
        Expression expr = new Expression("2 + 3 * 4 / 2");
        Number expected = new Number("10");

        // when
        Number actual = expr.calculate();

        // then
        assertThat(actual).isEqualTo(expected);
    }
}