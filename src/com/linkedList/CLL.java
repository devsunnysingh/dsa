package src.com.linkedList;

public class CLL {
    public class Node{
        Node node;
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void displayCircularList(){
        Node node=head;
        if(head!=null){
            do{
                System.out.println(node.value+"-->" );
                node=head.next;
            }while(node!=head);
        }
    }
    public void deleteNode(int value){
        Node node=head;
        while(node.value==value){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.value==value){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while (node!=head);

    }
}
