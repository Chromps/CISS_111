package P03;


/*
 * Name: Cameron Swift
 * Project: Project 3
 * Files: Employee.java, EntrySystem.java, Student.java
 * Date: 03/02/2014
 */



public class Student {
  
  private String FirstName = "";
  private String LastName = "";
  private double GPA = 0.0;
  private int Age = 0;
  private String Major = "";
  
  public Student(){
    
  }
  public Student(String FName, String LName, double GPA, int Age, String Major){
    this.FirstName = FName;
    this.LastName = LName;
    this.GPA = GPA;
    this.Age = Age;
    this.Major = Major;
  }
  
  public String getFirstName(){
    return this.FirstName;
  }
  public void setFirstName(String name){
    this.FirstName = name;
  }
  public String getLastName(){
    return this.LastName;
  }
  public void setLastName(String name){
    this.LastName = name;
  }
  public double getGPA(){
    return this.GPA;
  }
  public void setGPA(double gpa){
    this.GPA = gpa;
  }
  public int getAge(){
    return this.Age;
  }
  public void setAge(int age){
    this.Age = age;
  }
  public String getMajor(){
    return this.Major;
  }
  public void setMajor(String major){
    this.Major = major;
  }
  
  public String toString(){
    return this.FirstName + " " + this.LastName + "\nGPA: " + this.GPA + "\nAge: " + this.Age + "\nMajor: " + this.Major;
    
  }
}