import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class EntryMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("firstName" , "Denar");
        map.put("middleName" , "Ahmaron");
        map.put("lastName" , "Surya");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for(var entry : entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
