package Heap;

import java.util.ArrayList;

public class MinHeap<T extends Comparable<T>> {

    private final ArrayList<T> list;

    public MinHeap() {
        list = new ArrayList<>();
    }

    public int size() {
        return list.size();
    }
    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private int parent(int child) {
        return (child - 1) / 2;
    }

    private int leftChild(int parent) {
        return parent * 2 + 1;
    }

    private int rightChild(int parent) {
        return parent * 2 + 2;
    }

    public void insert(T t) {
        list.add(t);
        upHeap(list.size()-1);
    }

    private void upHeap(int index) {
        if(index == 0) return;
        int p = parent(index);

        if(list.get(index).compareTo(list.get(p)) < 0) {
            swap(p, index);
            upHeap(p);
        }

    }

    public T remove() throws Exception {
        if(list.isEmpty()) {
            throw new Exception("List is Empty");
        }

        T deleted = list.getFirst();
        T temp = list.removeLast();
        if(!list.isEmpty()) {
            list.set(0, temp);
            downHeap(0);
        }
        return deleted;
    }
    private void downHeap(int index) {
        int min = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(index != min) {
            swap(index, min);
            downHeap(min);
        }

    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    @Override
    public String toString() {
        return "MinHeap{" +
                "list=" + list +
                '}';
    }
}
