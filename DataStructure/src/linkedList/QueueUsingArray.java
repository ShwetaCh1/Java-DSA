package linkedList;

public class QueueUsingArray {
	private int size;
	 private int front;
	 private int rear;
	 private int[] arr; 
	 QueueUsingArray(int size){
		 this.size = size;
		 front = 0;
		 rear = -1;
		 arr = new int[size];
		}

		public void enQueue(int item) {
		 if(!isFull()) {
		 rear++;
		 arr[rear] = item;
		 }
		}
		
		public void deQueue() {
			 if(!isEmpty()) {


			 for(int i = 0; i < rear; i++) {
			 arr[i] = arr[i+1];
			 }
			 if(rear < size) {
			 arr[rear] = 0;
			 }
			 rear--;

			 }
		}
			 public void displayQueue() {
				 System.out.println();
				 for(int i = front; i <= rear; i++) {
				 System.out.print(arr[i] + " ");
				 }
				}
		
		public boolean isFull() {
				 if(size == rear-1) {
				 System.out.println("Queue is full");
				 return true;
				 } else {
				 return false;
				 }
				}

				public boolean isEmpty() {
				 if(front == (rear+1)) {
				 System.out.println("Queue is empty");
				 return true;
				 } else {
				 return false;
				 }
				}
				public static void main(String[] args) {
					 QueueUsingArray queue = new QueueUsingArray(5);
					 queue.enQueue(1);
					 queue.enQueue(2);
					 queue.enQueue(3);
					 queue.enQueue(4);
					 queue.displayQueue();
					 queue.deQueue();
					 queue.displayQueue();
					 queue.deQueue();
					 queue.displayQueue();
					}
				//////////////
				public class QueueUsingLL {

					 Node front;
					 Node rear;
					 QueueUsingLL() {
					 this.front = this.rear = null;
					 }
					 
					 public void enqueue(int item) {
						 Node temp = new Node(item);
						 if(this.rear == null) {
						 this.front = this.rear = temp;
						 }else {
						 this.rear.next = temp;
						 this.rear = temp;
						 }
						}
					 public void deQueue() {
						 if(this.front == null) {
						 return;
						 }
						 Node temp = this.front;
						 this.front = temp.next;
						 temp.next = null;
						 if(this.front == null) {
						 this.rear = null;
						 }
						}

						public void display() {
						 if(this.front == null) {
						 return;
						 } else {
						 Node temp = this.front;
						 while(temp.next != null) {
						 System.out.print(temp.data + " -> ");
						 temp = temp.next;
						 }
						 System.out.println(temp.data);
						 
						 public static void main(String[] args) {
							 QueueUsingLL queue = new QueueUsingLL();
							 queue.enqueue(1);
							 queue.enqueue(2);
							 queue.enqueue(3);
							 queue.enqueue(4);
							 queue.display();
							 queue.deQueue();
							 queue.display();
							 queue.deQueue();
							 queue.display();

							 }
							}
						 
						 class Node {
							 int data;
							 Node next;
							 Node(int data) {
							 this.data = data;
							 this.next = null;
							 }
							}
						// https://docs.google.com/presentation/d/1HxIof3CnKYtvO_AUKM343W6IWOOvv4PG/edit?usp=sharing&ouid=105787568810622731707&rtpof=true&sd=true9:25 pm 
						// https://ide.geeksforgeeks.org/65c944cf-affd-47bc-881f-bddac6404aa5 
							// https://ide.geeksforgeeks.org/c7d419c4-4892-462f-b393-7587231a7d6d9:15 pm
						 //https://ide.geeksforgeeks.org/01f28525-4095-49ab-b3ce-c16bb3cb51c18:36 pm
						// https://ide.geeksforgeeks.org/4de2a621-8d58-4553-be93-8718defe4bc39:08 pm
						 //https://ide.geeksforgeeks.org/3845390f-87c7-4a51-affc-32b7721f771b9:20 pm 
                         //https://ide.geeksforgeeks.org/3645804b-37ed-4e15-9a82-8f6b6eef6f409:30 pm 
                      //https://ide.geeksforgeeks.org/e5571156-5a2a-440e-b009-f8e387a1e1529:33 pm 
}
