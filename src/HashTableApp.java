import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("name", "Denar");
        map.put("address", "indonesia");
        map.put("gender", "male");

        for(var value : map.entrySet()){
            System.out.println(value.getKey() + " : " + value.getValue());
        }
    }
}
