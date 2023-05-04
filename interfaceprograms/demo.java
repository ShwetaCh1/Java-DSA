package interfaceprograms;

interface demo {

	 
	 
	 default void display() 
	{ 
	System.out.println("the display() method of DemoInterface1 invoked"); 
	} 
	} 
	interface DemoInterface2 
	{ 
	 default void display() 
	{ 
	System.out.println("the display() method of DemoInterface2 invoked"); 
	} 
	} 
	 class DemoClass implements demo, DemoInterface2 
	{ 
	public void display() 
	{ 
		demo.super.display(); // classname.super.display();
	DemoInterface2.super.display();
}
	}
