package jaf.example.objects;

public class Hello {
    public static void main(String[] args) {
        Greeting helloWerner = new Greeting("Werner");
        System.out.println(helloWerner.greet());
        var helloManuela = new Greeting("Manuela");
        System.out.println(helloManuela.greet());
        System.out.println(new Greeting("Peter").greet());
        System.out.println(helloWerner.getName());
        helloWerner.setName("Werni");
        System.out.println(helloWerner.getName());
        System.out.println(new Greeting().greet());
    }
}
