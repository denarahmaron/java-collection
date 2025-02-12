import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Denar");
        names.add("Ahmaron");
        names.add("Walter");
        names.addAll(Arrays.asList("Surya", "Gemilang"));

        names.remove("Denar");
        names.removeAll(Arrays.asList("Surya", "Gemilang"));

        for(var name : names){
            System.out.println(name);
        }

        System.out.println(names.contains("Ahmaron"));
        System.out.println(names.containsAll(Arrays.asList("Ahmaron", "Walter")));
    }
}
