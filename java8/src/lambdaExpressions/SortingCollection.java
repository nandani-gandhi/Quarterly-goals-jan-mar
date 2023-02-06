package lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jay");
        names.add("Jayraj");
        names.add("Jack");
        names.add("Jonita");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);
        Collections.sort(names);

    }
}
