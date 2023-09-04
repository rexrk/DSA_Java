package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("karen");
        queue.offer("chad");
        queue.offer("steve");
        queue.offer("harold");

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue.peek());

        System.out.println(queue);
    }
}
