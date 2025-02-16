import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("firstName", "Denar");
        map.put("middleName", "Ahmaron");
        map.put("lastName", "Surya");

        System.out.println(map.get("firstName"));
        System.out.println(map.get("middleName"));
        System.out.println(map.get("lastName"));
    }
}
