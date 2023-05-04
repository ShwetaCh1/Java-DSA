package ObjectOrientedProgramming;
class Student6 {
  private final String name;
  private int year;

  private static final int annualFees = 10000;

  public Student6(String name, int year) {
    this.name       = name;
    this.year       = year;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees() ;
  }

  public float computeFees () {
    return Student.annualFees * year;
  }
  public float computeFees (int annualFees){return annualFees*this.year;}
}

class ResearchStudent6 extends Student {
  private String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent6(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;

  }

  @Override
  public String getDetails() {
    return super.getDetails() + '\n' + "Research Area : " + this.researchArea;
  }
}





public class IandP6 {
  public static void main(String[] a) {


    Student s1 = new Student("karan", 2);
    System.out.println(s1.getDetails());
    System.out.println(s1.computeFees());
    ResearchStudent s2 = new ResearchStudent("siddharth", 3, "Software Engineering");
    System.out.println(s2.getDetails());
    System.out.println(s2.computeFees(1000));
  }
}

