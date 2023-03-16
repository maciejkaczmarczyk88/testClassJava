package task.Zada91;

import java.util.Scanner;

public class Calculator {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
    putOrInput();


    }
    static int number1;
    static int number2;

    public static String putOrInput(){
        System.out.println("Wprowadz pierwszą liczbe");
        number1 = sc.nextInt();
        sc.nextLine();

        System.out.println("wprowadz operato");
        String operator = sc.nextLine();
        System.out.println("Wprowadz drugą liczbę");
        number2 = sc.nextInt();
        sc.nextLine();
        choseOperator(operator);
        return number1 + operator + number2;
    }

    private static void choseOperator(String operator){
        switch (operator){
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1-number2); ;
            break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
            break;
            default:
                System.out.println("Brak takiego operator");
        }
    }
}
