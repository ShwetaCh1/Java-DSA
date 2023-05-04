package ObjectOrientedProgramming;

/*
 * class Source123 { private double length; private double breadth; public
 * Source123(double length, double breadth) { this.length=length;
 * this.breadth=breadth; } public double areaOfRectangle() { return
 * length*breadth; } } public class Rectangle { public static void main(String[]
 * args) { Source123 R1= new Source123(7.33,4.22);
 * System.out.println("Area of given rectangle is "+" "+R1.areaOfRectangle()); }
 * }
 */
class Base {
    public void display() {
        System.out.println("This is the display function of the base class.");
    }
}

interface BaseInterface {
    default public void display() {
        System.out.println("This is the display function of the interface class.");
    }
}

class Source12345 extends Base implements BaseInterface {

    public static void main(String[] args) {

        Source12345 obj = new Source12345();
        obj.display();
    }
}