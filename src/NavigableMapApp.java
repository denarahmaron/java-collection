import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("Ciro", "Ciro");
        map.put("Marc", "Marc");
        map.put("Nick", "Nick");

        for(var key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("-------");

        System.out.println(map.lowerKey("Marc"));
        System.out.println(map.higherKey("Marc"));

        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);
//        immutable.put("Mark", "Klok"); Error
    }
}
