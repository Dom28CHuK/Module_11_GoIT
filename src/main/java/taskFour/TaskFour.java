package taskFour;

import java.util.stream.Stream;

public class TaskFour {
    public Stream<Long> linearCongruentGenerator(long seed, long a, long c, long m) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
}
