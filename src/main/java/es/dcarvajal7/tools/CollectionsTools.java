package es.dcarvajal7.tools;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsTools {

    /**
     * Generic method to convert list of T to list of T
     */
    public static <T, U> List<U> transform(List<T> list, Function<T, U> function) {
        return list.stream()
                .map(function)
                .collect(Collectors.toList());
    }


}
