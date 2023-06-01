package taskThree;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class TaskThree {
    public String sortArray(String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
    }
}
