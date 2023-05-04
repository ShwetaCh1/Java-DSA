package ObjectOrientedProgramming;
public class Main1{
    public static void main(String[] a){
        Circle12 c1 = new Circle12(10f);
        System.out.println("area of circle = " + c1.area());

        Circle12 c2 = new Circle12(20f);
        System.out.println("area of circle = " + c2.area());

        Circle12 c3 = new Circle12(15f);
        System.out.println("area of circle = " + c3.area());
    }
}

class Circle12{
    public float radius;

    public Circle12(float r) {
        radius = r;
    }

    public float area(){
        return 3.141f * radius * radius;
    }
}





