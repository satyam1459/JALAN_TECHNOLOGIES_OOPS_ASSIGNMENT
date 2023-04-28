import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        // filter(Predicate)
        // Predicate means boolean valued function
        // e->{return true / return false;}

        // map(Function) --> Function return value
        /*
         * each element operation
         */

        List<String> cities = List.of("Kld", "Dli", "Knp", "Lko", "Gkp");
        // filter name starts with 'K'
        cities.stream().filter(e -> e.startsWith("K")).forEach(e -> {
            System.out.println(e);
        });
        System.out.println("--------------");
        List<String> newNames = cities.stream().filter(e -> e.startsWith("K")).collect(Collectors.toList());
        System.out.println(newNames);

        System.out.println("---------------------------");
        List<Integer> nums = List.of(23, 4, 2, 5, 7, 4);
        nums.stream().map(e -> e * e).forEach(e -> {
            System.out.println(e);
        });

        System.out.println("---------");
        nums.stream().forEach(System.out::println);

        // sort
        System.out.println("__________________________");
        nums.stream().sorted().forEach(e -> {
            System.out.println(e);
        });

        // minimum
        System.out.println("-------");
        Integer intger = nums.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Minimum : " + intger);

        // max
        Integer max = nums.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Maximum : " + max);
    }

}
