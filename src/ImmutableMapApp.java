import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> emptyMap = Collections.emptyMap();
        Map<String, String> singleMap = Collections.singletonMap("username", "denara");
        Map<String, String> map = Map.of(
                "firstName", "Denar",
                "middleName", "Ahmaron",
                "lastName", "Surya"
        );

//        map.put("firstName", "Wawan"); Error

        Map<String, String> mutable = new HashMap<>();
        mutable.put("password", "rahasia");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
//        immutable.put("password", "123"); Error
    }
}
