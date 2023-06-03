package taskFive;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class TaskFive {
    public <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorOne = first.iterator();
        Iterator<T> iteratorTwo = second.iterator();

        Iterable<T> iterable = () -> new Iterator<T>() {
            private boolean useFirst = true;
            @Override
            public boolean hasNext() {
                return useFirst ? iteratorOne.hasNext() : iteratorTwo.hasNext();
            }

            @Override
            public T next() {
                T next = useFirst ? iteratorOne.next() : iteratorTwo.next();
                useFirst = !useFirst;
                return next;
            }
        };
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
