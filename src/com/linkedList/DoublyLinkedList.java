package src.com.linkedList;
public class DoublyLinkedList {
    public class Node {
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
    public Node head;
    public Node tail;
    public int size;
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;

        if(head!=null){
        head.prev=node;
        }
        head=node;
        size+=1;
    }
    public void insertLastWithoutUsingTail(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            head.prev=null;
            head.next=null;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        node.next=null;
    }
    public void insertAtNthPosition(int nPositionValue,int value){
        Node newNode=new Node(value);
        Node positionNode=head;
        if(positionNode==null){
            head=positionNode;
        }
        while(positionNode.value!=nPositionValue){
            positionNode=positionNode.next;
        }
        newNode.next=positionNode.next;
        newNode.prev=newNode;
        positionNode.next=newNode;
        positionNode.next.prev=positionNode;
        return;
    }
    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.value +"--> ");
            last=node;
            node=node.next;
        }
        System.out.print("END");
    }
    public void displayReverse(){
        Node node=head;
        Node last=null;
        while(node.next!=null){
            node=node.next;
            last=node;
        }
        while(last!=null){
            System.out.print(last.value+"<-");
            last=last.prev;
        }

        System.out.print("<-START");
    }




}
