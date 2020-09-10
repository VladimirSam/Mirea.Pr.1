package ru.mira.ikbo2019.Samsonov.lab3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book book = new Book(1138,"Стивен Кинг", "Oно");
        Scanner scanPages = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);
        Scanner scanA = new Scanner(System.in);
        int pages;
        String name;
        String a;
        System.out.print("Введите кол-во страниц - ");
        pages = scanPages.nextInt();
        book.setPages(pages);
        System.out.print("Введите Автора - ");
        name = scanName.nextLine();
        book.setName(name);
        System.out.print("Введите Название произведения - ");
        a = scanA.nextLine();
        book.setA(a);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Кол-во страниц - " + book.getPages());
        System.out.println("Автор - " + book.getName());
        System.out.println("Название - " + book.getA());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Вывод с помощью toString - " + book.toString());


    }
}