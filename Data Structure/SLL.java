// import java.util.Arrays;

public class SLL{

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertData(list, 2);
        list.insertData(list, 4);
        list.insertData(list, 6);
        list.insertData(list, 8);

        Node temp=list.head;
         while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        list.deleteData(list, 6);
        temp=list.head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertData(SLL list, int data){

        Node newNode =new Node(data);

        if (list.head == null ){
            list.head  = newNode;
            return;
        }
            newNode.next = null;
            Node temp = list.head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            return;
    }

    public void deleteData(SLL list, int data){
        if(head==null)
        {

            return;
        }
       Node prev = list.head;
       
       if(prev.data == data && head!=null){
            list.head = head.next;
            return;
       }
       Node temp = prev.next;
       while(temp.next != null){
        if(temp.data == data){
            break;
        }
        else{
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
       }
    }
}