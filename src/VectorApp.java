import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for(var value : list){
            System.out.println(value);
        }

    }
}
