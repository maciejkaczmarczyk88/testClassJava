package classowe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PersonOperators {
    public static void main(String[] args) {

    String[] firstNames = {"jan", "Andrzej", "Marek", "Radosław"};
    String[] lastNames = {"Nowak", "Kowalski", "Mazurek", "Bączek"};
    int[] ages = {19, 35, 52, 42};

    Random random = new Random();

    Supplier<Person> persons = () -> {
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(firstNames.length)];
        int age = ages[random.nextInt(ages.length)];
        return new Person(firstName, lastName, age);
    };
    List<Person> people = generateRandomList(5, persons);
    consumerList(people, System.out::println);
}

    private static <T> List<T> generateRandomList(int elements, Supplier <T> supplier){
        List<T> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            list.add(supplier.get());
        }return list;
    }

    private static <T> void consumerList(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
