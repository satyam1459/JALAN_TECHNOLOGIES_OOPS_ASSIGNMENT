import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Stream API -- Collection process
        // collection / group of object

        // 1-Blank
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });

        // 2-> array,list,object,collection
        String names[] = { "Satyam", "Durgesh", "Sanjay", "Mayank" };
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        // 3->Builder patter
        Stream<Object> streamBuilder = Stream.builder().build();

        // 4
        IntStream stream = Arrays.stream(new int[] { 2, 4, 5, 6, 7, 8 });
        stream.forEach(e -> {
            System.out.println(e);
        });

        // 5. List,Set
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);
        System.out.println("----------------");
        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e -> {
            System.out.println(e);
        });

        System.out.println("----------------");
        // Stream<Integer> stream2 = list2.stream();
        list2.stream().forEach(e -> {
            System.out.println(e);
        });

        System.out.println("----------------");

    }
}
