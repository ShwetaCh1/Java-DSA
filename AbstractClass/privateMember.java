package AbstractClass;

 class newCode {

	public int a=10;
	private int b=20;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
public class privateMember {
	public static void main(String[] args) {
		
		newCode obj= new newCode();
		obj.setB(100);
		System.out.println(obj.getB());
		newCode obj1= new newCode();
		System.out.println(obj1.getB());
	}
	//https://github.com/vishalj64/upgrad-weekend10:06 pm 

}

