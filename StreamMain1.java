
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        // Create a list and filter all even number from list
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67); // this list cannot be changed

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        List<Integer> list3 = Arrays.asList(23, 54, 89, 76); // this list cannot be changed

        // List1
        // without stream- boiler plate code
        List<Integer> evenList = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0)
                evenList.add(i);
        }
        System.out.println(evenList);

        // Using stream API
        // Stream<Integer> stream = list1.stream();
        // List<Integer> newList = stream.filter(e -> e % 2 ==
        // 0).collect(Collectors.toList());
        // System.out.println(newList);

        List<Integer> newList = list1.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
    }
}
