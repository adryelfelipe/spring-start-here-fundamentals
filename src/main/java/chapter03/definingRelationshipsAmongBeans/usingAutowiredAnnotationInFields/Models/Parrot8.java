package chapter03.definingRelationshipsAmongBeans.usingAutowiredAnnotationInFields.Models;

import org.springframework.stereotype.Component;

@Component
public class Parrot8 {
    // Attributes
    private String name = "Pinho";

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
