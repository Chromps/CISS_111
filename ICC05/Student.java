package ICC05;

public class Student extends Person{
  private String major;
  private String id;
  private Double gpa;
  
  public Student(String major, String id, Double gpa, String name, int age){
    super(name, age);
    this.major = major;
    this.id = id;
    this.gpa = gpa;
  }
  public void SetMajor(String major){
    this.major = major;
  }
  public String GetMajor(){
    return this.major;
  }
  public void SetID(String id){
    this.id = id;
  }
  public String GetID(){
    return this.id;
  }
  public void SetGPA(double gpa){
    this.gpa = gpa;
  }
  public Double GetGPA(){
    return this.gpa;
  }
  
  
}