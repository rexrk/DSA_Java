package Heap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        MinHeap<Integer> heap = new MinHeap<>();
        heap.insert(20);
        heap.insert(22);
        heap.insert(51);
        heap.insert(42);
        heap.insert(12);
        heap.insert(3);
        heap.remove();

        ArrayList<Integer> data = heap.heapSort();
        data.forEach(System.out::println);

    }
}
