package Heap;

public class Main {
    public static void main(String[] args) {
        MinHeap<Integer> heap = new MinHeap<>();
        heap.insert(1);
        heap.insert(5);
        heap.insert(7);
        heap.insert(2);
        heap.insert(4);
        System.out.println(heap.getMin());
    }
}
