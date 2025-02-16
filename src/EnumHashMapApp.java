import java.util.EnumMap;

public class EnumHashMapApp {
    public static enum Level{
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        EnumMap<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Gratis");
        map.put(Level.PREMIUM, "Bayar");

        for(var key : map.keySet()){
            System.out.println(map.get(key));
        }
    }


}
