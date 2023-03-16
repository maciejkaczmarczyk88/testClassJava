package task.Zada9;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Tabs {
    public static void main(String[] args) {
        int[] tab1 = {2,3,4};
        int[] tab2 = {6,7,8};

        int i = tab1.length + tab2.length;
        System.out.println("iloś elementów  w tablicyi " + i);

        OptionalDouble average = Arrays.stream(tab1).average();
        System.out.println("Srednia " + average);
        int sum = Arrays.stream(tab2).sum() + Arrays.stream(tab1).sum();
        System.out.println("SUma " + sum);

    }
}
