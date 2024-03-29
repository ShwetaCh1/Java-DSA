package ObjectOrientedProgramming;
abstract class Per {
  protected final String name;

  public Per(String name) {
    this.name = name;

  }

  public abstract String getDetails();

}

class Stud extends Per{

  protected int year;

  protected static final int annualFees = 10000;

  public Stud(String name, int year) {
    super(name);
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + this.computeFees();
  }

  protected float computeFees() {
    return Student.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }



}

class Prof extends Per {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Prof(String name, int employeeNumber) {
    super(name);
    this.employeeNumber = employeeNumber;
  }
  public String getDetails(){
      return "Name : " + name + '\n' +
              "Salary : " + this.computeSalary();
    }

  public float computeSalary(){
    return this.startingSalary;

  }

}


class ResearchStud extends Stud {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStud(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student.annualFees * this.year*0.9f;
  }


  }


public class IandP11 {
  public static void main(String[] a) {

    Student s1 = new Student("karan", 2);
    //System.out.println(s1.getDetails());

    ResearchStudent s2 = new ResearchStudent("siddharth", 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor p1 = new Professor("SKC", 100);

    Person[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person [] persons) {
    for (Person person: persons) {
      System.out.println(person.getDetails());
    }
  }


}

