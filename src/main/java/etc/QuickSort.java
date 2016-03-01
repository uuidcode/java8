package etc;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class QuickSort {
    public static <T> List<T> quicksort(List<T> v, BiFunction<T, T, Integer> comparator) {
        if (v.size() < 2) {
            return v;
        }

        T pivot = v.get(v.size() / 2);

        List<T> list = new LinkedList<T>(
            quicksort(
                v.stream()
                    .filter(x -> comparator.apply(x, pivot) < 0)
                    .collect(Collectors.toList()), comparator)
        );

        list.addAll(
            v.stream()
                .filter(x -> comparator.apply(x, pivot) == 0)
                .collect(Collectors.toList())
        );

        list.addAll(
            quicksort(
                v.stream()
                    .filter(x -> comparator.apply(x, pivot) > 0)
                    .collect(Collectors.toList()), comparator)
        );

        return list;
    }
}

