package J2;
public class Calculator extends ExtendedCalculator {
    public static void main(String[] args) {
        double number = 64; // Example number
        double squareRoot = Calculator.squareRoot(number);
        double cubeRoot = Calculator.cubeRoot(number);
        System.out.println("Square root of " + number + " is: " + squareRoot);
        System.out.println("Cube root of " + number + " is: " + cubeRoot); }}

