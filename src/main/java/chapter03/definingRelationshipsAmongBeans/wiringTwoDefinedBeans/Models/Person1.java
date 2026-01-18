package chapter03.definingRelationshipsAmongBeans.wiringTwoDefinedBeans.Models;

public class Person1 {
    private String name;
    private Parrot6 parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot6 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot6 parrot) {
        this.parrot = parrot;
    }
}
