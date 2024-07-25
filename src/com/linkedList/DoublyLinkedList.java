package src.com.linkedList;
public class DoublyLinkedList {
    private class Node {
        private Node prev;
        private int value;
        private Node next;
        public Node(int value){
        this.value=value;
        }
        public Node(Node prev, int value, Node next) {
            this.prev=prev;
            this.value=value;
            this.next=next;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;

        if(head!=null){
        head.prev=node;
        }
//        if(tail==null){
//            tail=head;
//        }
        head=node;

        size+=1;
    }
    public void display(){
        Node node=head;

        while(node.next!=null){
            System.out.print(node.value +"--> ");
            node=node.next;
        }
        System.out.println("END");
    }


}
