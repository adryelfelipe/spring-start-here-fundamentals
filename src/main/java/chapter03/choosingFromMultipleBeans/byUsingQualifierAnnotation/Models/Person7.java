package chapter03.choosingFromMultipleBeans.byUsingQualifierAnnotation.Models;

public class Person7 {
    // Attributes
    private String name;
    private Parrot12 parrot;

    // Constructor
    public Person7(Parrot12 parrot) {
        this.parrot = parrot;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot12 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot12 parrot) {
        this.parrot = parrot;
    }
}
