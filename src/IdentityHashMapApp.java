import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {
        String key1 = "name.first";

        String name = "name";
        String first = "first";

        String key2 = name + "." + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        Map<String, String> map = new IdentityHashMap<>();
        map.put(key1, "Denar Ahmaron");
        map.put(key2, "Denar Ahmaron");

        System.out.println(map.size());
    }
}
