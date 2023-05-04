package fsdjavaprograms;
//https://github.com/Ashish2030/ppt4:23 pm 

abstract class Bike1 {

	Bike1(){
		System.out.println("1");
	}
	
	static void print()
	{
		System.out.println("2");
	}

	final void bootcamp() {
		System.out.println("3");
	}

}
class Honda extends Bike1{


	void dummy() {
		System.out.println("4");
	}
	static void print() {
		System.out.println("5");
	}

	public static void main(String[] args) {
		Honda obj=new Honda();
		Bike1.print();
		obj.bootcamp();

	}

}
