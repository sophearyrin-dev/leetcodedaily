package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,6,1,8,0,190);

        //for printing
        nums.forEach(n -> System.out.print(n + " "));

        //using count method,
        Stream<Integer> nums2 = nums.stream();
        System.out.println();
        System.out.println("all element of nusm2 =" + nums2.count());

        //using map
        nums.stream().sorted().map(x->x*2).forEach(n -> System.out.print(n + "-"));
        //output: 0-2-8-10-12-16-380-

        //using filter
        System.out.println("\nUsing Filter");
        nums.stream().filter(x -> x%2!=0).map(n->n*2).forEach(n -> System.out.print(n + "-"));

        //findany
        System.out.println("\nUsing find any");
        nums.stream().findAny().ifPresent(System.out::println);
        nums.stream().filter(x ->x%2==0).findAny().ifPresent(System.out::println);



    }
}
