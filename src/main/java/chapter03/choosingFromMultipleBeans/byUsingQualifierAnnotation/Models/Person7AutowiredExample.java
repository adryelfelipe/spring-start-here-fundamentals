package chapter03.choosingFromMultipleBeans.byUsingQualifierAnnotation.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person7AutowiredExample {
    // Attributes
    private String name;
    private Parrot12 parrot;

    // Constructor
    @Autowired
    public Person7AutowiredExample(@Qualifier("jezinha") Parrot12 parrot) {
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
