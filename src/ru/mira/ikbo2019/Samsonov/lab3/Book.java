package ru.mira.ikbo2019.Samsonov.lab3;

public class Book {
    int pages;
    String name;
    String a;
    public Book(int pages, String name, String a){
        this.pages = pages;
        this.name = name;
        this.a = a;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", name='" + name + "a=" + a + '\'' +
                '}';
    }
}