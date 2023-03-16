package task.Zada1;

import java.util.Scanner;

public class CalculatorPlus {
    public static void main(String[] args) throws UnknownOperatorException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę ");
        int one = sc.nextInt();
        System.out.println("Podaj operator jeden z  +,-,*,/");
        sc.nextLine();
        String sign = sc.nextLine();
        System.out.println("Podaj drugą liczbę ");
        int two = sc.nextInt();
        int sum = 0;
        if (sign != "*" || sign != "-" || sign != "*" || sign != "/") {
            switch (sign) {
                case "+":
                    sum = one + two;
                    break;
                case "-":
                    sum = one - two;
                    break;
                case "*":
                    sum = one * two;
                case "/":
                    if (two != 0) {
                        sum = one / two;
                    } else {
                        throw new ArithmeticException("NIe mozna dzielić przez zero");
                    }
                    break;
                default:
                    System.out.println("Podano błędny znak");
                    throw new UnknownOperatorException("podano zły argument");
            }
            System.out.println("Wynik działąńia " + sum);
        }
    }
}
