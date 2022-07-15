package es.dcarvajal7.tools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@SpringBootTest
class CollectionsToolsUnitTest {

    @Test
    void contextLoads() {
    }

    @Test
    public void whenListOfString_thenReturnListOfInteger() {
        List<String> stringList = Arrays.asList("-1", "2", "3", "4", "5");
        List<Integer> integerList = CollectionsTools.transform(stringList, Integer::parseInt);
        assertThat(integerList).isEqualTo(Arrays.asList(-1, 2, 3, 4, 5));
        assertThat(integerList).asList();
    }

    @Test
    public void whenListOfString_thenReturnListOfIntegerKO() {
        List<String> stringList = Arrays.asList("-1", "2", "3", "4", "5");
        List<Integer> integerList = CollectionsTools.transform(stringList, Integer::parseInt);
        assertThat(integerList).isNotEqualTo(Arrays.asList(-1, 3, 3, 4, 5));
        assertThat(integerList).asList();
    }

    @Test
    public void whenListOfInteger_thenReturnListOfString() {
        List<Integer> integerList= Arrays.asList(-1, 2, 3, 4, 5);
        List<String> stringList = CollectionsTools.transform(integerList, String::valueOf);
        assertThat(stringList).isEqualTo(Arrays.asList("-1", "2", "3", "4", "5"));
        assertThat(stringList).asList();
    }

    @Test
    public void whenListOfString_thenReturnListOfLong() {
        List<String> stringList = Arrays.asList("-1", "2", "3", "4", "5");
        List<Long> longList = CollectionsTools.transform(stringList, Long::valueOf);
        assertThat(longList).isEqualTo(Arrays.asList(-1L, 2L, 3L, 4L, 5L));
        assertThat(longList).asList();
    }

    @Test
    public void whenListOfLong_thenReturnListOfString() {
        List<Long> longList = Arrays.asList(-1L, 2L, 3L, 4L, 5L);
        List<String> stringList = CollectionsTools.transform(longList, String::valueOf);
        assertThat(stringList).isEqualTo(Arrays.asList("-1", "2", "3", "4", "5"));
        assertThat(stringList).asList();
    }

    @Test
    public void whenMultipleListOfLong_thenReturnMergeList() {
        List<Long> longList = Arrays.asList(-1L, 2L, 3L);
        List<Long> longList2 = Arrays.asList(4L, 5L);
        List<Long> resultList = CollectionsTools.merge(longList, longList2);
        assertThat(resultList).isEqualTo(Arrays.asList(-1L, 2L, 3L,4L, 5L));
    }

    @Test
    public void whenMultipleListOfString_thenReturnMergeList() {
        List<String> stringList = Arrays.asList("-1", "2", "3");
        List<String> stringList2 = Arrays.asList("4", "5");
        List<String> resultList = CollectionsTools.merge(stringList, stringList2);
        assertThat(resultList).isEqualTo(Arrays.asList("-1", "2", "3", "4", "5"));
    }

    @Test
    public void whenMultipleListOfString_thenReturnMergeListKO() {
        List<String> stringList = Arrays.asList("-1", "2", "3");
        List<String> stringList2 = Arrays.asList("4", "5");
        List<String> resultList = CollectionsTools.merge(stringList, stringList2);
        assertThat(resultList).isNotEqualTo(Arrays.asList("-1", "3", "3", "4", "5"));
    }

    @Test
    public void whenListOfNoSortedString_thenReturnSortedListOK() {
        List<String> stringList = Arrays.asList("5", "2", "3");
        List<String> resultList = CollectionsTools.sort(stringList, Comparator.comparing(String::toString));
        assertThat(resultList).isEqualTo(Arrays.asList("2", "3", "5"));
    }

    @Test
    public void whenListOfNoSortedLong_thenReturnSortedListOK() {
        List<Long> longList = Arrays.asList(5L, 2L, 3L);
        List<Long> resultList = CollectionsTools.sort(longList, Comparator.comparing(Long::valueOf));
        assertThat(resultList).isEqualTo(Arrays.asList(2L, 3L, 5L));
    }

    @Test
    public void whenListOfNoSortedString_thenReturnSortedListKO() {
        List<String> stringList = Arrays.asList("5", "2", "3");
        List<String> resultList = CollectionsTools.sort(stringList, Comparator.comparing(String::toString));
        assertThat(resultList).isNotEqualTo(Arrays.asList("2", "8", "5"));
    }
}
