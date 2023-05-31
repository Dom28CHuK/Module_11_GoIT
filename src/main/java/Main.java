import taskOne.NameIndexesOdd;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NameIndexesOdd nameIndexesOdd = new NameIndexesOdd();
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Mary");
        names.add("David");
        names.add("Alice");
        names.add("Peter");
        nameIndexesOdd.namesWithOddSubscripts(names);
    }
}
