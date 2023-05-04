package ObjectOrientedProgramming;
interface Person12 {
   public abstract String getDetails();
   public abstract float computeSalary();
}

class Student21 implements Person12{
  protected final int rollNumber;
  protected int year;

  protected static final int annualFees = 10000;
  protected static final int annualSalary = 15000;

  public Student21(int rollNumber, int year) {
    this.rollNumber = rollNumber;
    this.year = year;
  }


  public String getDetails() {
    return "Roll Number : " + rollNumber + '\n' +
            "Fees : " + this.computeFees();
  }

  protected float computeFees() {
    return Student21.annualFees * year;
  }

  public float computeFees(int annualFees){
    return Student21.annualFees * this.year;
  }

  public float computeSalary() {
    return Student21.annualSalary * this.year;
  }
}

class Professor12 implements Person12 {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Professor12(int employeeNumber) {
    this.employeeNumber = employeeNumber;
  }
  public String getDetails(){
      return "Employee Number : " + this.employeeNumber;
    }

  public float computeSalary(){
    return this.startingSalary;

  }

}


class ResearchStudent21 extends Student21 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent21(int rollNumber, int year, String researchArea) {
    super(rollNumber, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student21.annualFees * this.year*0.9f;
  }


  }


public class IandP12 {
  public static void main(String[] a) {

    Student21 s1 = new Student21(200, 2);
    //System.out.println(s1.getDetails());

    ResearchStudent21 s2 = new ResearchStudent21(300, 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor12 p1 = new Professor12(100);

    Person12[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person12 [] persons) {
    for (Person12 person: persons) {
      System.out.println(person.getDetails());
      System.out.println("Salary: " + person.computeSalary());
    }
  }


}

