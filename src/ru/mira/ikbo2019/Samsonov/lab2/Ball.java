package ru.mira.ikbo2019.Samsonov.lab2;

public class Ball {
    int size;
    String color;
    public Ball(int size, String color){
        this.size= size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int age) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "age=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}