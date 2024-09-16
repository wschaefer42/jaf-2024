package jaf.example.preparation;

public class Dog extends Pet {
    private String race = "";

    private Dog(String name) {
        super(name);
    }

    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String speak() {
        return "Wau Wau";
    }

    @Override
    public String toString() {
        return "Dog [name=" + getName() + ", race=" + race + "]";
    }

    public static Dog createDog(String name) {
        Dog dog = new Dog(name);
        Pet.perts.add(dog);
        return dog;
    }
}
