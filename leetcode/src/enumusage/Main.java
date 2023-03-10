package enumusage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Color.valueOf("RED"));
        Arrays.stream(Color.values())
                .filter(e->e.name().equalsIgnoreCase("YELLOW"))
                .forEach(System.out::println);
    }
}
