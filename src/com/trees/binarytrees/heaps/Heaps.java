package src.com.trees.binarytrees.heaps;

import java.util.ArrayList;

//extends Comparable helps to compare two objects
public class Heaps<T extends Comparable<T>> {
    private ArrayList<T> list;


    public Heaps() {
        this.list = new ArrayList<>();
    }
    private void swap(int first, int second){
        T temp=list.get(first);
        list.set(first, list.get(second));
        list.set(second,temp);
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index) {
        return (index*2)+1;
    }
    private int right(int index){
        return (index*2)+2;
    }
    public void insert(T value){
        list.add(value);
        upHeap(list.size()-1);
    }
    public void upHeap(int index){
//        doing it as up Heap--> inserting at the end and starting from the  bottom
        if(index==0){
            return;
        }
        int p= parent(index);
        if(list.get(index).compareTo(list.get(p))<0){
            swap(index,p);
            upHeap(p);
        }

    }
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an Empty heap");
        }
        T temp=list.get(0);
        T last= list.remove(list.size()-1);
//now here we will do downheap. We will compare and exchange indices of value starting from top to bottom

        if(!list.isEmpty()){
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }
    public void downHeap(int index){
       int min=index;
       int left=left(index);
       int right=right(index);
       if(left<list.size() && list.get(min).compareTo(list.get(left))>0){
           min=left;
       }
       if(right<list.size() && list.get(min).compareTo(list.get(right))>0){
           min=right;
       }
       if(min!=index){
           swap(min,index);
           downHeap(min);
       }

    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> sortedData = new ArrayList<>();
        while (!list.isEmpty()) {
            sortedData.add(this.remove());
        }
        return sortedData;
    }

}
