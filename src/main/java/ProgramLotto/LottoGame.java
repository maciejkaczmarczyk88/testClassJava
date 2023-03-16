package ProgramLotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LottoGame {
    public static void main(String[] args) {

        LottoGame lottoGame = new LottoGame();
        String words = "NOWE Pole";
        Function<String, String> func = text -> words.toLowerCase().trim();
        System.out.println(func.apply(words));

        Consumer<String> print3Time = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };

        print3Time.accept("xxxxx");
        print3Time.accept("bbb");

        int agePerson = 19;
        Predicate<Integer> chackNumber = age -> age >= 18;
        boolean test = chackNumber.test(agePerson);
        System.out.println(test);





        System.out.println("Witamy w losowaniu lotto");
        List<Integer> userNumbers = lottoGame.readNumbersFromUser();
        Lotto lotto = new Lotto();
        int result = lotto.checkResult(userNumbers);
        List<Integer> lottoResult = lotto.getLottoResult();
        System.out.println("Twoje liczby: " + userNumbers);
        System.out.println("Wynik losowania: " + lottoResult);
        System.out.println("Liczba trafień: " + result);
    }

     List<Integer> readNumbersFromUser() {
        List<Integer> userNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Lotto.MAX_NUMBERS; i++) {
            System.out.println("Podaj kolejną liczbę");
            int nextNumber = input.nextInt();
            userNumbers.add(nextNumber);
        }
        return userNumbers;
    }


}