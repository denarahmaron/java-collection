import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("One");
        List<String> empty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.add("Denar");
        mutable.add("Ahmaron");
        List<String> immutable = Collections.unmodifiableList(mutable);
//        immutable.add("Ciro"); Error

        List<String> elements = List.of("David","Da", "Silva");
        for (var element : elements){
            System.out.println(element);
        }
    }
}
