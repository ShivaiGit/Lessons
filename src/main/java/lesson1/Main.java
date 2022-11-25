package lesson1;


public class Main {
    public static void main(String[] args) {

        System.out.println("Ответ " + result(2, 3, 5, 78));
        System.out.println(isNegativeOrPositive(9,4));
        printNegativeOrPositive(9);
        System.out.println(isNegative(-35));
        printName("Тося");
        leapYear(2022);
    }

    /*
    Задача №1 Создать переменные всех пройденных типов данных, и инициализировать их значения;
     */
    byte aByte = 2;
    short aShort = 23;
    int anInt = 659;
    long aLong = 88797;

    float aFloat = 3.14159f;
    double aDouble = 3.14159265d;

    char aChar = '<';

    boolean aBoolean = true;

    /*
    Задача №2 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – входные параметры этого метода.
     */
    private static int result(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }


    /*
    Задача №3 Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;
     */
    private static boolean isNegativeOrPositive(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    /*Задача №4 Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    Замечание: ноль считаем положительным числом.
     */
    private static void printNegativeOrPositive(int a) {
        if (a >= 0)
            System.out.println("Число " + a + " положительное");
        else
            System.out.println("Число " + a + "  отрицательное");
    }

    /*
    Задача №5 Написать метод, которому в качестве параметра передается целое число,
    метод должен вернуть true, если число отрицательное;
     */
    private static boolean isNegative(int a) {
        return a <= 0;
    }

    /*
    Задача №6 Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
     */
    private static void printName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /*
    Задача №7 Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    private static void leapYear(int year) {
//        boolean isLeap = isLeapYear(year);
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.print(year + " это год високосный\n");
        } else {
            System.out.print(year + " этод год не високосный\n");
        }
    }
    /*
    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }*/

}