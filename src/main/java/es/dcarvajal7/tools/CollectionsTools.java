package es.dcarvajal7.tools;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsTools {

    /**
     * Generic method to convert list of T to list of T
     */
    public static <T, U> List<U> transform(List<T> list, Function<T, U> function) {
        return list.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    /**
     * Merge multiple lists of T
     */
    public static <T> List<T>  merge(List<T> ... lists){
        return Stream.of(lists).flatMap(Collection::stream).collect(Collectors.toList());
    }

    /**
     * sort list of T
     */
    public static <T> List<T> sort(List<T> list, Comparator<? super T> comparator) {
        return list.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }



}
