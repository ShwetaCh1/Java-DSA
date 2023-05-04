package linkedList;
	public class StackUsingLL {

		 NodeI root;


		 boolean isEmpty() {
		 return root == null;
		 }
		 
		 void push(int data) {
			 NodeI newNode = new NodeI(data);
			 if(isEmpty()) {
			 root = newNode;

			 }else {
			 NodeI temp = root;
			 root = newNode;
			 newNode.next = temp;

			 }
			 System.out.println(data + " - pushed into stack");
			}

			int pop()
			{
			 if(isEmpty()) {
			 System.out.println("stack underflow");
			 return -1;
			 } else {
			 int res = root.data;
			 root = root.next;
			 System.out.println("Popped element is " + res);
			 return res;
			 }
			} 
			void display() {
			 if(isEmpty()) {
			 System.out.println("Nothing in stack to display");
			 } else {
			 NodeI temp = root;
			 while(temp.next != null) {
			 System.out.print(temp.data + "->");
			 temp = temp.next;

			 }
			 System.out.println(temp.data);
			 }
			}
			
			int peek() {
				 if(isEmpty()) {
				 System.out.println("stack underflow");
				 return -1;
				 } else {
				 System.out.println("Last element is " + root.data);
				 return root.data;
				 }
				}
			public static void main(String[] args) {
				 StackUsingLL stack = new StackUsingLL();
				 stack.pop();
				 stack.push(23);
				 stack.push(34);
				 stack.peek();
				 stack.push(45);
				 stack.push(56);
				 stack.pop();
				 stack.push(54);
				 stack.push(43);
				 stack.push(32);
				 stack.pop();
				 stack.display();
				 }
				} 
				class NodeI {
				 int data;
				 NodeI next;
				 NodeI(int data) {
				 this.data = data;
				 }
			

}

