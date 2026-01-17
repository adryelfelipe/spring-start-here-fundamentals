package chapter03.usingAutowiredAnnotationInFields.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person3 {
    // Attributes
    private String name;

    @Autowired
    private Parrot8 parrot;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot8 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot8 parrot) {
        this.parrot = parrot;
    }
}
