package practic.filtering;

import java.util.Arrays;

public class CollectionFilter {

    public static <T> T[] filter(T[] array, Filter filter) {
        Object[] arr = Arrays.stream(array).map(filter::apply).toArray(Object[]::new);
        return (T[]) arr;
    }
}
