package jaf.example.introduction;

import java.util.Objects;

public class Datentypen {
    public static void printOut(Long aLong) {
        if (!Objects.isNull(aLong)) {
            System.out.println(aLong);
        }
    }

    public static void printOut2(long aLong) {
        System.out.println(aLong);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(n);
        Integer n1 = 20;
        float f = n1.floatValue();
        float f2 = Float.valueOf(n);
        System.out.println(n1 + n);

        long aLong = 100_000_000_000L;
        byte aByte = (byte) aLong;
        short aShort = 5000;
        boolean aBoolean = true;
        float aFloat = 1.2f;
        double aDouble = 1.2;

        Long aLong2 = null;
        printOut(13L);
        printOut(aLong2);
        printOut2(13L);

        String greetingFormula = "Hello";
        String myName = "Werner";
        String helloMessage = greetingFormula + " " + myName;
        System.out.println(helloMessage);

        System.out.println(String.format("%s %s", greetingFormula, myName));

    }
}
