package chapter03.choosingFromMultipleBeans.byUsingPrimaryAnnotation.Models;

import chapter03.choosingFromMultipleBeans.byUsingQualifierAnnotation.Models.Parrot12;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person8AutowiredExample {
    // Attributes
    private String name;
    private Parrot13 parrot;

    // Constructor
    @Autowired
    public Person8AutowiredExample(Parrot13 parrot) {
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
