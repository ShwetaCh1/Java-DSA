package linkedList;

class node1 {
	    int data;
	    node1 next;
	    node1(int data){
	        this.data = data;
	        next = null;
	    }
	}
	    public class SingleLinkedList {
	         node1 head = null;
	           node1 tail= null;
	        public void insert(int data) 
	        {
	            node1 box = new node1 (data);
	            if(head == null)
	            {
	                head = box;
	                head.next = box;
	                tail=box;
	            }
	            else
	            {
	                tail.next=box;
	                box.next=head;
	                tail=box;
	                
	            }
	        }
	        public void display(SingleLinkedList obj)
	        {
	            node1 temp=obj.head;
	            do 
	            {
	                System.out.println(temp.data);
	                temp=temp.next;
	            }while(temp!=head);
	        }

	    public static void main(String args[]) {
	        SingleLinkedList obj = new SingleLinkedList();
	      int arr[] = {1,2,3,4,5,6};
	      for (int i = 0; i < arr.length; i++){
	          obj.insert(arr[i]);
	      }
	      obj.display(obj);
	    }
	}

