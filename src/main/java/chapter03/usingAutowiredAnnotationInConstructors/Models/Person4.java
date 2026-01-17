package chapter03.usingAutowiredAnnotationInConstructors.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person4 {
    // Attribute
    private String name = "Miguel";
    private Parrot9 parrot;

    // Constructor
    @Autowired
    public Person4(Parrot9 parrot) {
        this.parrot = parrot;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot9 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot9 parrot) {
        this.parrot = parrot;
    }
}
