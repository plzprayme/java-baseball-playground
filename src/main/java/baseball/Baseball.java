package baseball;

import java.util.Scanner;

public class Baseball {
    private static final int INSERT_COIN = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            Number number = NumberFactory.create();
            Player computer = new Player(number);

            System.out.println("숫자를 입력해주세요: ");
            String attack = scanner.nextLine();
            Number attackNumber = new Number(attack);
            System.out.println(computer.compare(attackNumber));
        } while(true);
    }
}
