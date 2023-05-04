package ObjectOrientedProgramming;
public class StaticVariable{
    public static void main(String[] a){
        Circle765 c1 = new Circle765(10f);
        System.out.println("area of circle = " + c1.area());

        Circle765 c2 = new Circle765(20f);
        System.out.println("area of circle = " + c2.area());

        Circle765 c3 = new Circle765(15f);
        System.out.println("area of circle = " + c3.area());
        System.out.println("circumference of circle = " + c3.circumference());
    }
}

class Circle765{
    public float radius;
    public static float PI = 3.1414f;

    public Circle765(){
    }

    public Circle765(float radius) {
        this.radius = radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }

    public float circumference(){
        return 2 * PI * this.radius;
    }
}





