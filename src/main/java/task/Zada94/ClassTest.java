package task.Zada94;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxValue = 100;
        int sum = 0;

        while (maxValue >= sum ) {
            System.out.println("Poadj liczbe");
            int number = sc.nextInt();
            sum = sum + number;
        }
        System.out.println("NIe możesz podać wiekszej liczby");


    }
}
