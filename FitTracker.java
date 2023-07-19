package tracker;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FitTracker {
    static Scanner scr = new Scanner(System.in);
    private String name;
    private LocalDate birthDate;
    private int telNumber;
    private String mail;
    private String surname;
    private int weight;
    private int artPressure;
    private int stepValue;
    private final int age;

    public FitTracker(String name, LocalDate birthDate, int telNumber, String mail) {
        this.name = name;
        this.birthDate = birthDate;
        this.telNumber = telNumber;
        this.mail = mail;
        this.age = Period.between(birthDate, LocalDate.now()).getYears();
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private LocalDate getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    private int getTelNumber() {
        return telNumber;
    }

    private void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    private String getMail() {
        return mail;
    }

    private void setMail(String mail) {
        this.mail = mail;
    }

    private String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private int getArtPressure() {
        return artPressure;
    }

    private void setArtPressure(int artPressure) {
        this.artPressure = artPressure;
    }

    private int getStepValue() {
        return stepValue;
    }

    private void setStepValue(int stepValue) {
        this.stepValue = stepValue;
    }

    private int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        LocalDate birthdayFirst = LocalDate.of(1994, 10, 2);
        FitTracker personFirst = new FitTracker("John", birthdayFirst, 85779398, "babayaga@gmail.com");
        System.out.println("Insert Surname: ");
        personFirst.setSurname(scr.next());
        System.out.println("Insert Weight: ");
        personFirst.setWeight(scr.nextInt());
        System.out.println("Insert Arterial pressure: ");
        personFirst.setArtPressure(scr.nextInt());
        System.out.println("Insert number of steps: ");
        personFirst.setStepValue(scr.nextInt());
        personFirst.printAccountInfo();

        LocalDate birthdaySecond = LocalDate.of(1999, 3, 9);
        FitTracker personSecond = new FitTracker("Jack", birthdaySecond, 8985445, "fernext@gmail.com");
        System.out.println("Insert Surname: ");
        personSecond.setSurname(scr.next());
        System.out.println("Insert Weight: ");
        personSecond.setWeight(scr.nextInt());
        System.out.println("Insert Arterial pressure: ");
        personSecond.setArtPressure(scr.nextInt());
        System.out.println("Insert number of steps: ");
        personSecond.setStepValue(scr.nextInt());
        personSecond.printAccountInfo();

        LocalDate birthdayThird = LocalDate.of(1997, 12, 6);
        FitTracker personThird = new FitTracker("Fil", birthdayThird, 81213238, "filot@gmail.com");
        System.out.println("Insert Surname: ");
        personThird.setSurname(scr.next());
        System.out.println("Insert Weight: ");
        personThird.setWeight(scr.nextInt());
        System.out.println("Insert Arterial pressure: ");
        personThird.setArtPressure(scr.nextInt());
        System.out.println("Insert number of steps: ");
        personThird.setStepValue(scr.nextInt());
        personThird.printAccountInfo();

    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birth date: " + birthDate);
        System.out.println("Tel.Number: " + telNumber);
        System.out.println("Mail: " + mail);
        System.out.println("Weight: " + weight);
        System.out.println("Art.Pressure: " + artPressure);
        System.out.println("Steps: " + stepValue);
        System.out.println("Age: " + age);
    }
}
//Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи йому обліковий запис,
// приймаючи наступні параметри:
//Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані лише за допомогою гетерів):
//Ім'я//Дата народження (окремо день, місяць, рік)//Емейл//Телефон
// Змінювані:
//Прізвище//Вага//Тиск//Кількість пройдених за день кроків
//Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
//Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача
//Після прийому року народження - вираховувати вік користувача у внутрішню змінну age
// (відштовхуючись просто від 2020 року, ускладнювати тут не будемо), на яку зробити тільки геттер і виводити
// на екран разом з іншими полями в методі printAccountInfo(); у конструкторі або геттерах/сеттерах не використовуємо
// виведення в консоль.
//У main-класі створити 3-5 користувачів та роздрукувати дані кожного через виклик
// методу printAccountInfo(); для двох користувачів змінити кілька полів та роздрукувати нові дані повторно
