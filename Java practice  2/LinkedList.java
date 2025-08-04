public class LinkedList {
    public static class Node{
        int data; 
        Node next;


    public Node(int data){
        this.data=data;
        this.next=null;
    }

    }
    public static Node head;
    public static Node tail;
     public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(int data){
        //create node
        Node newNode= new Node(data);

        if(head==null){
            head = tail=newNode;
            return;
        }
        newNode.next=head;
 
        head=newNode;



    }
     public void addLast(int data){
        //create node
        Node newNode= new Node(data);

        if(head==null){
            head = tail=newNode;
            return;
        }
         newNode.next=tail;

        tail=newNode;



    }



    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(9);

        list.print();


    }
    
}
