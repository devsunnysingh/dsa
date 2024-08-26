package src.com.trees.binarytrees.heaps;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Heaps<Integer> heap=new Heaps<>();
        heap.insert(34);
        heap.insert(43);
        heap.insert(24);
        heap.insert(13);
        heap.insert(4);
        heap.insert(73);
        heap.insert(44);
        heap.insert(40);
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());

        ArrayList list=heap.heapSort();
        System.out.println(list);

    }
}
