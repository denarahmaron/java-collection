import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Ade", "Andre", "Budi", "Jajang", "Rafly"));

        NavigableSet<String> namesDesc = names.descendingSet();
        NavigableSet<String> budi = names.tailSet("Budi", true);

        for (var name : budi) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("Aji"); immutable
    }
}
