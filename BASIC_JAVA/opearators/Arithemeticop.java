package Opearators;

/**
 * Arithemeticop
 */
public class Arithemeticop {

    // addition
    public static int addition() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }

    // subtraction
    public static int subtraction() {
        int a = 10;
        int b = 20;
        int c = a - b;
        return c;
    }

    // multiplication
    public static int multiplication() {
        int a = 10;
        int b = 20;
        int c = a * b;
        return c;
    }

    // division
    public static int division() {
        int a = 10;
        int b = 20;
        int c = a / b;
        return c;
    }

    // modulus
    public static int modulus() {

        int a = 10;
        int b = 20;
        int c = a % b;
        return c;
    }

    public static void main(String[] args) {

        System.out.println("Addition : " + addition());
        System.out.println("Subtraction : " + subtraction());
        System.out.println("Multiplication  : " + multiplication());
        System.out.println("Division : " + division());
        System.out.println("Modules : " + modulus());
    }
}