package taskOne;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameIndexesOdd {
    public String namesWithOddSubscripts(List<String> listName) {
        return IntStream.range(0, listName.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> (i + 1) + ". " + listName.get(i))
                .collect(Collectors.joining(", "));
    }
}
