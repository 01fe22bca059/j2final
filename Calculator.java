public class SimpleCalculator {
    public static void main(String[] args) {
        // Hardcoded values for demonstration
        double num1 = 25.0;
        double num2 = 8.0;
        double num3 = -16.0; // Example of a negative number for square root
        
        // Square root calculation
        System.out.println("Calculating square root...");
        calculateSquareRoot(num1);
        calculateSquareRoot(num2);
        calculateSquareRoot(num3);

        // Cube root calculation
        System.out.println("\nCalculating cube root...");
        calculateCubeRoot(num1);
        calculateCubeRoot(num2);
        calculateCubeRoot(num3);
    }

    private static void calculateSquareRoot(double num) {
        if (num < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number: " + num);
        } else {
            double result = Math.sqrt(num);
            System.out.println("Square Root of " + num + " is: " + result);
        }
    }

    private static void calculateCubeRoot(double num) {
        double result = Math.cbrt(num);
        System.out.println("Cube Root of " + num + " is: " + result);
    }
}
