import taskOne.TaskOne;
import taskThree.TaskThree;
import taskTwo.TaskTwo;

import java.util.List;

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

    }
}
