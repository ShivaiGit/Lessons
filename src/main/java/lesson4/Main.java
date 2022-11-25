package lesson4;

/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
Конструктор класса должен заполнять эти поля при создании объекта;
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
Создать массив из 5 сотрудников
С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
*/
public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        person[1] = new Person("Galaev Yarik", "Driver", "ivivan@mailbox.com", "892312312", 29999, 40);
        person[2] = new Person("Belov Martin", "Manager", "ivivan@mailbox.com", "892312312", 423654, 42);
        person[3] = new Person("Liarboev Kulan", "Reloader", "ivivan@mailbox.com", "892312312", 31555, 29);
        person[4] = new Person("Chivon Rast", "Programmer", "ivivan@mailbox.com", "892312312", 25999, 25);
        for (Person p : person) {
            if (p.getAge() >= 40)
                p.printInfo();
        }
    }
}
