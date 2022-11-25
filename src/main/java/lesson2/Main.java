package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        arrTask1();
        arrTask2();
        arrTask3();
        arrTask4();
        arrTask5();
        System.out.println(isCheckBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));

    }

    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void arrTask1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    private static void arrTask2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static void arrTask3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }
    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */

    private static void arrTask4() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) arr[i][j] = 1;
            }
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
    /*
    5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    */

    private static void arrTask5() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        /*int max = 0;
        int min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            } else {
                min = i;
            }
        }*/
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr.length - 1;
        System.out.println("Максимальный элемент = " + max + ". Mинимальный элемент = " + min);
    }

    /*
    6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    если в массиве есть место, в котором сумма левой и правой части массива равны.
    */
    private static boolean isCheckBalance(int[] arr) {
        int arrSum = 0;
        for (int i : arr) {
            arrSum += i;
        }
        int rightSum = 0;
        for (int i : arr) {
            rightSum += i;
            if (rightSum == arrSum - rightSum) {
                return true;
            }
        }
        return false;
    }
}
