package P03;


/*
 * Name: Cameron Swift
 * Project: Project 3
 * Files: Employee.java, EntrySystem.java, Student.java
 * Date: 03/02/2014
 */

public class Employee {
  private String firstName;
  private String lastName;
  private String department;
  private double salary;
  
  public Employee(){
    
    
  }
  public String getFirstName(){
    return this.firstName;
  }
  public void setFirstName(String name){
    this.firstName = name;
  }
  public String getLastName(){
    return this.lastName;
  }
  public void setLastName(String name){
    this.lastName = name;
  }
  public String getDepartment(){
    return this.department;
  }
  public void setDepartment(String dep){
    this.department = dep;
  }
  public double getSalary(){
    return this.salary;
  }
  public void setSalary(double salary){
    this.salary = salary;
  }
  public String toString(){
    return this.firstName+" "+this.lastName+"\nDepartment: "+this.department+"\nSalary: $"+this.salary;
  }
   
}