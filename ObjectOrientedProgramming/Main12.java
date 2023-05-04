package ObjectOrientedProgramming;
public class Main12{
    public static void main(String[] a){
        Circle123 c1 = new Circle123(10f);
        System.out.println("area of circle = " + c1.area());

        Circle123 c2 = new Circle123(20f);
        System.out.println("area of circle = " + c2.area());

        Circle123 c3 = new Circle123();
        System.out.println("area of circle = " + c3.area());
        
         c3.displayProfile();
    }
}

class Circle123{
    public float radius;

    public Circle123(){
    }

    public Circle123(float radius) {
        this.radius = radius;
    }

    public float area(){
        return 3.141f * this.radius * this.radius;
    }
    
    public void displayProfile() {
        System.out.println(radius);
    }
}





