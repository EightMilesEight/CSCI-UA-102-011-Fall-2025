package LinkedList_final;

import java.util.Arrays;

public class DynamicList<E> extends ArrayList<E> {
    int capacity;

    public DynamicList() {
        super();
    }

    public DynamicList(int capacity) {
        super(capacity);
        this.capacity = capacity;
    }

    private void increaseArraySize(int new_size) {
        array = Arrays.copyOf(array, new_size);
        capacity = new_size;
    }

    public void addFirst(E element) {
        if (size == capacity) {
            increaseArraySize(capacity * 2);
        }
        super.addFirst(element);
    }

    public void addLast(E element) {
        if (size == capacity) {
            increaseArraySize(capacity * 2);
        }
        super.addLast(element);
    }

    public static void main(String[] args) {
        DynamicList<Integer> dynamic_list = new DynamicList<Integer>(2);
        for (int i = 1; i <= 20; i++) {
            dynamic_list.addLast(i);
        }
        System.out.println(dynamic_list.capacity);
    }
}
