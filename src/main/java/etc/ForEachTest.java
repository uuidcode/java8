package etc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 4, 3, 2, 6, 7);
        list.forEach(n -> System.out.println(n));
        list.forEach(System.out::println);
        System.out.println();
        Collections.sort(list, (Integer i1, Integer i2) -> i1.compareTo(i2));
        list.forEach(n -> System.out.println(n));
    }
}
