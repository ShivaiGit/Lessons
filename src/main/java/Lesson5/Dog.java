package Lesson5;

public class Dog extends Animal {
    private int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    void run(int distanceRun) {
        int maxDistanceRun = 500;
        if (distanceRun > maxDistanceRun)
            System.out.println("Собака " + name + " пробежала " + maxDistanceRun + " м.");
        else
            System.out.println("Собака " + name + " пробежала всю дистанцию");
    }

    @Override
    void swim(int distanceSwim) {
        int maxDistanceSwim = 10;
        if (distanceSwim > maxDistanceSwim)
            System.out.println("Собака " + name + " проплыла только " + maxDistanceSwim + " м.");
        else
            System.out.println("Собака " + name + " проплыла всю дистанцию");
    }

    void printInfo() {
        System.out.println("Создано " + count + " собак.");
    }
}
