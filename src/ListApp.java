import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
        List<String> strings = new LinkedList<>();
        strings.add("Denar");
        strings.add("Ahmaron");
        strings.addAll(Arrays.asList("Surya", "Gemilang"));
        strings.set(1, "Ahmarin");
        System.out.println(strings.get(1));
    }
}
