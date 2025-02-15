import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueApp {
    public static void main(String[] args) {
//        Deque<String> stack = new LinkedList<>();
        Deque<String> stack = new ArrayDeque<>();

        stack.offerLast("Wawan");
        stack.offerLast("Aji");
        stack.offerLast("Maman");
        stack.offerLast("Eli");

        for(String item = stack.pollLast(); item != null; item = stack.pollLast()){
            System.out.println(item);
        }

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Denar");
        queue.offerLast("Andi");
        queue.offerLast("Bagus");

        for(String next = queue.pollFirst(); next != null; next = queue.pollFirst()){
            System.out.println(next);
        }
    }
}
