package chapter02.usingStereotypeAnnotations.componentAndPostConstructAnnotations.Models;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot4 {
    // Atribute
    private String name;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method that Spring initializes immediately after creating the object
    @PostConstruct
    public void init() {
        this.name = "RobsonBird";
    }
}
