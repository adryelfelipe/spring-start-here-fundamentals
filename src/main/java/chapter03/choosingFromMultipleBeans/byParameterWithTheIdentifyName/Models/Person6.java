package chapter03.choosingFromMultipleBeans.byParameterWithTheIdentifyName.Models;

public class Person6 {
    // Attributes
    private String name;
    private Parrot11 parrot;

    // Constructor
    public Person6(Parrot11 parrot) {
        this.parrot = parrot;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot11 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot11 parrot) {
        this.parrot = parrot;
    }
}
