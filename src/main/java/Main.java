import taskOne.NameIndexesOdd;
import taskTwo.SortedList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NameIndexesOdd nameIndexesOdd = new NameIndexesOdd();
        List<String> listName = List.of("Oleg", "Ivan", "Dom", "Peter", "Olga", "Stepan", "Vasil", "Baron", "Orel", "Burk");
        System.out.println(nameIndexesOdd.namesWithOddSubscripts(listName));

        SortedList sortedList = new SortedList();
        System.out.println(sortedList.specialSortedList(listName));

    }
}
