package ru.mira.ikbo2019.Samsonov.lab2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ball ball = new Ball(5, "Футбол");
        Scanner scanSize = new Scanner(System.in);
        Scanner scanColor = new Scanner(System.in);
        int size;
        String color;
        System.out.print("Введите размер меча -  ");
        size = scanSize.nextInt();
        ball.setSize(size);
        System.out.print("Введите игру для который преднозначен этот мяч -");
        color = scanColor.nextLine();
        ball.setColor(color);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Размер меча - " + ball.getSize());
        System.out.println("Игровой мяч для - " + ball.getColor() + "a");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Вывод с помощью toString - " + ball.toString());


    }
}