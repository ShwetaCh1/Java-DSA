package ObjectOrientedProgramming;

public class main43 {
	//Radius of a circle
	public static float radius=10f;
	public static float length=20f;
public static void main(String [] args) {
	
	System.out.println("Area of the circle is  "+ Circle.area(radius));
	System.out.println( "Area of the square is "+Square.area(length));
}
//public static float area(float radius) {
	//return 3.141f *radius *radius;
//}

static class Circle{
	public static float area(float radius) {
		return 3.141f *radius *radius;
}
}	
	static class Square{
		public static float area(float length) {
			return length*length;
	
	}
}
}
