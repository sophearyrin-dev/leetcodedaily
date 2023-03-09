package hashmap;

import java.util.HashMap;

public class TestHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();

        numbers.put("a", 10);
        numbers.put("a", 20);
        numbers.put("b",40);

        System.out.println(numbers);
    }
}
