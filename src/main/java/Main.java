import taskOne.NameIndexesOdd;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NameIndexesOdd nameIndexesOdd = new NameIndexesOdd();
        List<String> listName = List.of("Oleg", "Ivan", "Dom", "Peter", "Olga", "Stepan");
        nameIndexesOdd.namesWithOddSubscripts(listName);



    }
}
