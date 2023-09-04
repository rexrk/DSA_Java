package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Comparator<Double> comp = (n, m) -> {
            if(n > m) {
                return 1;
            } else if (n < m) {
                return -1;
            } else
                return 0;

        };
        Queue<Double> queue = new PriorityQueue<>(comp);
        queue.offer(4.2);
        queue.offer(1.9);
        queue.offer(2.10);
        queue.offer(3.8);

        System.out.println(queue);
    }
}
