package taskTwo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    public List<String> specialSortedList(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
