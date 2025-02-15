import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
//        Set<String> names = new LinkedHashSet<>();
        names.add("Football");
        names.add("Persib");
        names.add("Bandung");
        names.add("Indonesia");
        names.add("Persib");
        names.add("Bandung");
        names.add("Indonesia");

        for(var name : names){
            System.out.println(name);
        }
    }
}
