package task.Zada21;

import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("Silnia " + number + " = " + result);
    }

    static int factorial(int n) {
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}
