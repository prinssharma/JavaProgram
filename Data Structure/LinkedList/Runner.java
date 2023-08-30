package LinkedList;

public class Runner {
    public static void main(String[] args) {
        
        SingleLinkedList list = new SingleLinkedList();

        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.show();
        list.insertAtStart(35);
        list.show();
        list.insertAtStart(55);
        list.show();
        list.deleteAt(3);
        list.show();
    }
}
