package ru.skypro;
public class Main {
    public static void main(String[] args) {
	task1();
    task2();
    task3();
    }
    public static void task1() {
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);
    }
    public static void task2() {
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        fullName =  fullName.toUpperCase();
        System.out.println(fullName);
    }
    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName =  fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}
