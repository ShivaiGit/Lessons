package Lesson5;

public class Cat extends Animal {
    private int count;
    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    void run(int distanceRun) {
        int maxDistanceRun = 200;
        if (distanceRun > maxDistanceRun)
            System.out.println("Кот " + name + " пробежал " + maxDistanceRun + " м.");
        else
            System.out.println("Кот " + name +" пробежал всю дистанцию");
    }

    @Override
    void swim(int distanceRun) {
        System.out.println("Кот " + name +" не умеет плавать");
    }

    @Override
    void printInfo() {
        System.out.println("Создано " + count + " котов.");
    }
}
