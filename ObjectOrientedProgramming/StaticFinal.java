package ObjectOrientedProgramming;
public class StaticFinal{
    public static void main(String[] a){
        Circle234 c1 = new Circle234(10f);
        System.out.println("area of circle = " + c1.area());

        Circle234 c2 = new Circle234(20f);
        System.out.println("area of circle = " + c2.area());

        Circle234 c3 = new Circle234(15f);
        System.out.println("area of circle = " + c3.area());
        System.out.println("circumference of circle = " + c3.circumference());
    }
}

class Circle234{
    public float radius;
    public static final float PI = 3.1414f;

    public Circle234(){
    }

    public Circle234(float radius) {
        this.radius = radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }

    public float circumference(){
        return 2 * PI * this.radius;
    }
}





