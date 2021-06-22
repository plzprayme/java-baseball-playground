package baseball;

public class Player {
    private final Number number;

    public Player(Number number) {
        this.number = number;
    }

    public String compare(Number attack) {
        return number.match(attack);
    }

}
