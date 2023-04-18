import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.empty();
        Collection<String> collection = Arrays.asList("aa", "bb", "cc");
        collection.stream();

        String[] arr = {"aa", "bb", "cc"};
        Arrays.stream(arr);
//        IntStream
//        LongStream
//        DoubleStream

        IntStream stream = "hallo".chars();

        int[] ints = {1, 3, 65, 5, 7, 10, 70};
        int count = 0;
        for (int i : ints) {
            if (i > 60) continue;
            i += 1;
            count++;
            if (count > 4) break;
            System.out.println(i);
        }

        IntStream.of(1, 3, 65, 5, 7, 10, 70).filter(x -> x < 60).map(x -> x + 1).limit(4).forEach(System.out::print);
    }
}