package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessNumber();
    }
/*
    Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
*/
    static void guessNumber () {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int randomNumber = random.nextInt(10);

        System.out.println("Отгадайте число от 0 до 10. У вас 3 попытки!");

        while (count >= 0) {
            count++;
            if (count == 4) {
                System.out.println("Попытки закончилсиь! Вы проиграли!");
                break;
            }
            System.out.println("Введите число - ");
            int myNumber = scanner.nextInt();
            if (myNumber != randomNumber) {
                System.out.println("Вы не угадали!");
            } else {
                System.out.println("Вы угадали");
                break;
            }
        }
    }
}
