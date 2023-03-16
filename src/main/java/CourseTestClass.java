import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CourseTestClass {
    public static void main(String[] args) {

        Stream<Course> courseStream = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );

 /*       Optional<Course> min = courseStream.min((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()));
        System.out.println(min);*/

/*        long count = courseStream.count();
        System.out.println(count);*/


//        List<Integer> collect = IntStream.range(0, 20).boxed().collect(Collectors.toList());
//        System.out.println(collect);

//        Stream<Course> courses = Stream.of(
//                new Course(1L, "Java", 199, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(1L, "Java", 199, "Programowanie"),
//                new Course(3L, "Tajniki Google", 299, "Marketing"),
//                new Course(1L, "Java", 199, "Programowanie")
//        );
//        Stream<Course> distinct = courses.distinct();
//        distinct.forEach(System.out::println);
/*        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Zarządznie zespołem", 159, "Biznes"),
                new Course(4L, "Tajniki Google", 299, "Marketing"),
                new Course(5L, "Python od podstaw", 169, "Programowanie"));

        Stream<Course> courseStream1 = courses.filter(c -> c.getPrice() > 200);
        courseStream1.forEach(System.out::println);*/

//        Stream<Course> courses = Stream.of(
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(3L, "Java od podstaw", 159, "Programowanie"),
//                new Course(4L, "Tajniki Google", 299, "Marketing")
//        );
//        List<String> java = courses
//                .map(Course::getName)
//                .filter(name -> name.toLowerCase().contains("java"))
//                .collect(Collectors.toList());
//        System.out.println(java);

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );

        /*Course[] courses1 = courses.toArray(Course[]::new);
        System.out.println(Arrays.toString(courses1));*/

      /*  List<Course> collect = courses.collect(Collectors.toList());
        System.out.println(collect);*/

        Stream<String> names = Stream.of("Ania", "Kasia", "Basia");
        String allNames = names.reduce("", (result, next) -> result + next + " ");
        System.out.println(allNames); //Ania Kasia Basia
    }
}
