package baseball;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberFactory {
    private static final Integer START = 0;
    private static final Integer END = 3;

    private static final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

    public static Number create() {
        shuffle();
        String number = joinToString(numbers.subList(START, END));
        return new Number(number);
    }

    private static void shuffle() {
        Collections.shuffle(numbers);
    }

    private static String joinToString(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();

        for (Integer number : numbers) {
            sb.append(number);
        }

        return sb.toString();
    }
}
