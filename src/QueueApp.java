import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>();
//        Queue<String> queue = new PriorityQueue<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("Denar");
        queue.add("Andi");
        queue.add("Budi");

        for(String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }
    }
}
