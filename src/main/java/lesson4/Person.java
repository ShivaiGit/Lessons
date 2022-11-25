package lesson4;

public class Person {
    private String fullName;
    private String post;
    private String email;
    private int tellNumber;
    private int salary;
    private int age;

    public Person(String fullName, String post, String email, int tellNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.tellNumber = tellNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Сотрудник" +
                "ФИО - " + fullName + '\'' +
                "Долность - " + post + '\'' +
                "Эл. почта - " + email + '\'' +
                "Номер телефона - " + tellNumber +
                "Зарплата - " + salary +
                "Возрат - " + age);
    }
}
