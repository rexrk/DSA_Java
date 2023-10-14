package Heap;

import java.util.ArrayList;

public class MinHeap<T extends Comparable<T>> {

    private final ArrayList<T> list;

    public MinHeap() {
        list = new ArrayList<>();
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private int parent(int child) {
        return (child - 1) * 2;
    }

    private int leftChild(int parent) {
        return parent * 2 + 1;
    }

    private int rightChild(int parent) {
        return parent * 2 + 2;
    }

    public void insert(T item) {
        list.add(item);
        uphead(list.size() - 1);
    }

    private void uphead(int index) {
        if(index == 0) return;

        int parent = parent(index);
        if(list.get(index).compareTo(list.get(parent)) < 0) {
            swap(index, parent);
            uphead(parent);
        }
    }

    public T getMin() {
        return list.get(0);
    }

}
