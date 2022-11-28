package Lesson5;

import java.sql.SQLOutput;

public abstract class Animal {
    String name;
    int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    abstract void run(int distance);

    abstract void swim(int distance);

    void printInfo() {
        System.out.println("Создано " + count + " животных.");
    }
}
