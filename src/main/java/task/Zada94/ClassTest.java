package task.Zada94;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<>();
        int maxValue = 100;
        int sum = 0;

        while (maxValue >= sum ) {
            System.out.println("Poadj liczbe");
            int number = sc.nextInt();
            numbers.add(number);
            sum = sum + number;
        }
        if (sum % 2 == 0){
            System.out.println(sum +  " Liczba parzysta");
        }
        else {
            System.out.println(sum + " Liczna nie parzysta");
        }
        System.out.println("Podane liczby to ");

        numbers.forEach( text -> System.out.print(text + ", "));

        System.out.println("NIe możesz podać wiekszej liczby " + sum);

    }
}
