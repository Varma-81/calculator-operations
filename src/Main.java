public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator project created.");
        
        BasicCalculator calculator = new BasicCalculator();

        System.out.println("Addition: " + calculator.addition(10, 5));
        System.out.println("Subtraction: " + calculator.subtraction(10, 5));
        System.out.println("Multiplication: " + calculator.multiplication(10, 5));

    }
}