package ru.mira.ikbo2019.Samsonov.lab1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(4,"Бобик");
        Scanner scanAge = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);
        int age;
        String name;
        System.out.print("Введите возраст собаки - ");
        age = scanAge.nextInt();
        dog.setAge(age);
        System.out.print("Введите кличку собаки - ");
        name = scanName.nextLine();
        dog.setName(name);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Возраст собаки - " + dog.getAge());
        System.out.println("Кличка собаки - " + dog.getName());
        System.out.println("Возраст собаки в человеческой форме - " + dog.res(dog.getAge()));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Вывод с помощью toString - " + dog.toString());


    }
}