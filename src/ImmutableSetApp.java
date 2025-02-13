import java.util.*;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> singe = Collections.singleton("Denar");

        Set<String> mutable = new HashSet<>();
        mutable.add("Bandung");
        mutable.add("Jakarta");
        mutable.add("Cirebon");

        Set<String> immutable = Collections.unmodifiableSet(mutable);
//        immutable.add("Ciro"); Error
//        immutable.remove("Jakarta"); Error
        for(var value : immutable){
            System.out.println(value);
        }

        Set<String> names = Set.of("Sasuke", "Uciha", "Konoha");
//        names.add("Sasuke"); Error
    }
}
