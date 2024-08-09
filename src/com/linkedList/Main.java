package src.com.linkedList;

public class Main {


    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.display();
        System.out.println("\n");
        list.displayReverse();
        list.insertLastWithoutUsingTail(1);
        list.display();
        list.insertAtNthPosition(4,99);
        System.out.println("\n");
        list.display();

    }
}
