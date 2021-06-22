package baseball;

import java.util.Arrays;
import java.util.List;

public class NumberService {
    private final int FIRST = 0;
    private final int SECOND = 1;
    private final int THIRD = 2;

    private final List<Integer> excludeFirst = Arrays.asList(SECOND, THIRD);
    private final List<Integer> excludeSecond = Arrays.asList(FIRST, THIRD);
    private final List<Integer> excludeThird = Arrays.asList(FIRST, SECOND);

    public List<Integer> getOtherPosition(int position) {
        if (position == FIRST) {
            return excludeFirst;
        }

        if (position == SECOND) {
            return excludeSecond;
        }

        if (position == THIRD) {
            return excludeThird;
        }

        throw new IllegalArgumentException();
    }
}
