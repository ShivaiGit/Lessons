package lesson3;

/*Игра угадай число*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessNumber();
    }

    private static void guessNumber() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        final int MAX_NUMBER = 10;
        int randomNumber = random.nextInt(MAX_NUMBER);
        final int NUMBER_OF_ATTEMPTS = 3;
        int userNumber;

        System.out.println("Угадай число");
        for (int i = 0; i < NUMBER_OF_ATTEMPTS; i++) {
            System.out.println("Введите число от 0 до " + MAX_NUMBER + " - ");
            System.out.printf("Попытка номер %d.%n", i + 1);
            while (true) {
                if (scanner.hasNextInt()) {
                    userNumber = scanner.nextInt();
                    break;
                } else {
                    System.out.print("Неверный ввод. Введите число от 0 до 10 - ");
                    scanner.nextLine();
                }
            }
            if (userNumber == randomNumber) {
                System.out.println("Вы угадали");
                break;
            }
            System.out.println("Вы не угадали!");
        }
        System.out.println("Попытки закончилсиь! Вы проиграли!\n Хотите сыграть ещё раз? Если да то введите цифру - 1 ");
        if (scanner.hasNextInt()) {
            int tryAgain = scanner.nextInt();
            if (tryAgain == 1) {
                guessNumber();
            } else {
                System.out.println("Игра закончена!");
            }
        }
    }
}
