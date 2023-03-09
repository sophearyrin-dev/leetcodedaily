package hashmap;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(10);

        System.out.println(numbers);
    }
}
