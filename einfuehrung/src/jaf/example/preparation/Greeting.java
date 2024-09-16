package jaf.example.preparation;

public class Greeting {
    private final String name;
    public Greeting(String name) {
        this.name = name;
    }
    public String greet() {
        return "Hallo " + name;
    }
}
