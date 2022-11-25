package lesson4;

public class Person {
    private String fullName;
    private String post;
    private String email;
    private String tellNumber;
    private int salary;
    private int age;

    public Person(String fullName, String post, String email, String tellNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.tellNumber = tellNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("Сотрудник " +
                "ФИО - " + fullName + "\n" +
                "Долность - " + post + "\n" +
                "Эл. почта - " + email + "\n" +
                "Номер телефона - " + tellNumber + "\n" +
                "Зарплата - " + salary + "\n" +
                "Возрат - " + age);
        System.out.println();
    }
}
