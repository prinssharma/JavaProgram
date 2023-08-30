package LinkedList;

public class SingleLinkedList{

    Node head;

    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;

        }
    }

    public void insertAtStart(int data){

        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;

    }

    public void insertAt(int index, int data){

        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n= head;

        if(index == 0){
            insertAtStart(data);
            return;
        }
        
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
        
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
            System.out.println("Deleted element : "+head.data);
            return;
        }
        Node n = head;
        Node n1 = null;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        n1 = n.next;
        n.next = n1.next;
        System.out.print("Deleted element : "+n1.data);
        System.out.println();
    }
}