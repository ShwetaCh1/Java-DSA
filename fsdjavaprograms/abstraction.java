package fsdjavaprograms;

abstract class abstraction {
	abstraction(){
		System.out.println("shweta");
	}
	static void print() {
		System.out.println("print()");
	}

}
class Honda1 extends abstraction {
	public static void main(String[] args) {
		
Honda1 obj=new Honda1();
obj.print();

	}
}