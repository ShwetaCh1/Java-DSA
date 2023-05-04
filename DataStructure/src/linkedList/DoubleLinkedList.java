package linkedList;

class Node {
    int data;
    Node next;
    Node prev;
     Node(int data){
        this.data = data;
        next = null;
    }
}
    public class DoubleLinkedList {
         Node head = null;
           Node tail= null;
        public void insert(int data) 
        {
            Node box = new Node (data);
            if(head == null)
            {
                head = box;
                head.next = box;
                head.prev=box;
                tail=box;
            }
            else
            {
                tail.next=box;
                box.prev=tail;
                box.next=head;
                head.prev=box;
                tail=box;
                
            }
        }
        public void display(DoubleLinkedList obj)
        {
            Node temp=obj.tail;
            do 
            {
                System.out.println(temp.data);
                temp=temp.prev;
            }while(temp!=tail);
        }

    public static void main(String args[]) {
        DoubleLinkedList obj = new DoubleLinkedList();
      int arr[] = {1,2,3,4,5,6};
      for (int i = 0; i < arr.length; i++){
          obj.insert(arr[i]);
      }
      obj.display(obj);
    }
}