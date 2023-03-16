package task.Zada92;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić");
        int amountNamber = sc.nextInt();
        int[] numbers = new int[amountNamber];
        int count = 0;
        int sum = 0;
        while (amountNamber > 0){
            int nextNumber = sc.nextInt();
            count++;
            numbers[count-1]  = nextNumber;
            amountNamber--;
            sum = sum + amountNamber;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("suma " + sum);
    }
}
