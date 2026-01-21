package chapter06.exercising.Models;

public class Book {
    // Attributes
    private String name;
    private String author;

    // Construcotr
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
