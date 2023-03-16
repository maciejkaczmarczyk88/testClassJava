package task.Zada99;

import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość słów");
        int word = sc.nextInt();
        sc.nextLine();
        String[] words = new String[word];

        for (int i = 0; i < word; i++) {
            System.out.println("Podaj słowo");
            words[i] = sc.nextLine();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word; i++) {
            sb.append(words[i].charAt(words[i].length() - 1));
        }
        System.out.println("Nowe słowo " + sb.toString());
        System.out.println();

        for (String wordPrint : words) {
            System.out.println(wordPrint);
        }
    }
}
