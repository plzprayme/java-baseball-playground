package baseball;

import java.util.Scanner;

public class BaseballService {
    public static final int EXIT = 2;
    public static final int START = 1;
    Scanner scanner;

    public BaseballService() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int answer = scanner.nextInt();
        if (answer == START) {

        }

        if (answer == EXIT) {

        }
        scanner.nextInt();

    }
}
