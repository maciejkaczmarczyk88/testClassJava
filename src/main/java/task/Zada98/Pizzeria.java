package task.Zada98;

import java.util.Locale;
import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        allPizza();
        System.out.println("Please choose pizzas");
        Pizza pizza = Pizza.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));

        System.out.println("Your chose is " + pizza.name());
    }

    public static void allPizza (){
        Pizza[] values = Pizza.values();
        System.out.println("Pizzas available");
        for (Pizza value : values) {
            System.out.println(value);
        }
    }
}
