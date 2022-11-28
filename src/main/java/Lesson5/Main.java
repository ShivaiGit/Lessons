package Lesson5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Bobik");
        cat.run(200);
        cat.swim(212);
        cat.printInfo();
        System.out.println();
        dog.run(200);
        dog.swim(212);
        dog.printInfo();
        System.out.println();

    }
}
