package jaf.example.preparation;

public class Figures {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(19.2);
        System.out.println(circle2.getArea());
        var area = new Circle(4.5).getArea();
        System.out.println(area);
    }
}
