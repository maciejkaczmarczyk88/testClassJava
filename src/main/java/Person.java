import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Marcin");
        names.add("Kazimierz");
        names.add("Ala");
        names.add("Adam");
       sortName(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
    private static void sortName(List<String> names ){
        Collections.sort(names, String::compareToIgnoreCase);
    }


}
