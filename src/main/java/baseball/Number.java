package baseball;

public class Number {
    private final int STRIKE = 1;
    private final int NOTHING = 0;


    private final String numbers;

    public Number(String numbers) {
        this.numbers = numbers;
    }

    public String match(Number attack) {
        return String.format("%d 스트라이크, %d 볼", countStrike(attack), countBall(attack));
    }

    private int countStrike(Number attack) {
        int count = 0;

        for (int i = 0; i < numbers.length(); i++) {
            count += isStrike(i, attack);
        }

        return count;
    }

    private int isStrike(int index, Number attack) {
        if (numbers.charAt(index) == attack.numbers.charAt(index)) {
            return STRIKE;
        }

        return NOTHING;
    }

    private int countBall(Number attack) {
        int count = 0;

        for (int i = 0; i< numbers.length(); i++) {

            for (int position: new NumberService().getOtherPosition(i)) {

                if (numbers.charAt(i) == attack.numbers.charAt(position)) {
                    count += 1;
                    break;
                }

            }

        }

        return count;
    }

    @Override
    public String toString() {
        return numbers;
    }
}
