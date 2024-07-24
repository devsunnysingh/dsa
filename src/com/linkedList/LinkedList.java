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
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
        }
        Node node=new Node(val);
        tail.next=node;
        node.next=null;
        tail=node;
        size=size+1;

    }
    public void insertAfterGivenPosition(int val, int position){

        if(position==0){insertFirst(val);}
        if(position==size){insertLast(val);}
        Node temp=head;
        for (int i = 1; i < position; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val=head.value;
        if(head==null){
            head=tail=null;
        }
        head=head.next;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=1;i<index;i++){
            node=node.next;
        }
        return node;

    }
    public int deleteLastNode(){
        if(size>=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=secondLast.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public int deleteAGivenIndex(int position){
         Node prev=get(position-1);
         int val=prev.next.value;
         prev.next=prev.next.next;
         return val;
    }
    public Node find(int value){
        Node node=head;
        while (node.value!=value){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;

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
        list.insertLast(17);
        list.insertAfterGivenPosition(200,2);
        list.displayList();


    }
    }




