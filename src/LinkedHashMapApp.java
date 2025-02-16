import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("first", "Denar");
        map.put("middle", "Ahmaron");
        map.put("last", "Surya");

        for(var key : map.keySet()){
            System.out.println(key);
        }
    }
}
