package classowe;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int[] integerStream1 = intStream.filter(x -> x % 2 == 0).toArray();
        System.out.println(Arrays.toString(integerStream1));

    }
}
