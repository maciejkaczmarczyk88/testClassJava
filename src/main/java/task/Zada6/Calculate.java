package task.Zada6;

public class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int numberOnet = 50;
        int numberTwo = 75;

        calculator.add(numberOnet, numberTwo);
        calculator.subtract(numberOnet, numberTwo);
        calculator.multiply(numberOnet, numberTwo);
        calculator.divide(numberOnet, numberTwo);

    }
}
