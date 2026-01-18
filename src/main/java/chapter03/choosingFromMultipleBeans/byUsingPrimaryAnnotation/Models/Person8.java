package chapter03.choosingFromMultipleBeans.byUsingPrimaryAnnotation.Models;

public class Person8 {
    // Attributes
    private String name;
    private Parrot13 parrot;

    // Constructor
    public Person8(Parrot13 parrot) {
        this.parrot = parrot;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot13 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot13 parrot) {
        this.parrot = parrot;
    }
}
