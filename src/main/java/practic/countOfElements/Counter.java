package practic.countOfElements;

import java.util.HashMap;

public class Counter {
    public static <T> HashMap<T, Integer> countElems(T[] elems) {
        HashMap<T, Integer> count = new HashMap<>();
        for (T elem : elems) {
            count.put(elem, count.getOrDefault(elem, 0) + 1);
        }
        return count;
    }
}
