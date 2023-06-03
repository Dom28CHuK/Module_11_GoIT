import taskFive.TaskFive;
import taskFour.TaskFour;
import taskOne.TaskOne;
import taskThree.TaskThree;
import taskTwo.TaskTwo;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        List<String> listName = List.of("Oleg", "Ivan", "Dom", "Peter", "Olga", "Stepan", "Vasil", "Baron", "Orel", "Burk");
        System.out.println(taskOne.namesWithOddSubscripts(listName));

        TaskTwo taskTwo = new TaskTwo();
        System.out.println(taskTwo.specialSortedList(listName));

        TaskThree taskThree = new TaskThree();
        String[] array = {"1, 2, 0", "4, 5", "3, 6, 7"};
        System.out.println(taskThree.sortArray(array));

        TaskFour taskFour = new TaskFour();
        long seed = 123456789L;
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2,48);
        Stream<Long> longStream = taskFour.linearCongruentGenerator(seed, a, c, m);
        longStream.limit(10).forEach(System.out::println);

        TaskFive taskFive = new TaskFive();
        Stream<String> streamOne = Stream.of("A", "B", "C", "D");
        Stream<String> streamTwo = Stream.of("1", "2", "3", "4", "5");
        Stream<String> streamZip = taskFive.zip(streamOne, streamTwo);
        streamZip.forEach(System.out::println);


    }
}
