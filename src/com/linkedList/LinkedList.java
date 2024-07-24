package src.com.linkedList;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
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
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void displayList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value +"-->");
            temp=temp.next;

        }
        System.out.print("END");

    }
    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.insertFirst(3);
        list.insertFirst(2);list.insertFirst(8);
        list.insertFirst(17);
        list.displayList();


    }
    }




