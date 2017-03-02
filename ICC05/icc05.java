package ICC05;

import static java.lang.System.*;


public class icc05{
  public static void main(String[] args){
    String id, name, major;
    int age;
    double gpa;
    
    id = Helper.GetStringInput("Enter Student's ID:");
    name = Helper.GetStringInput("Enter Student's Name:");
    major = Helper.GetStringInput("Enter Student's Major:");
    age = Helper.GetIntegerInput("Enter Student's Age:");
    gpa = Helper.GetDoubleInput("Enter Student's GPA:");
    
    Student student = new Student(major, id, gpa, name, age);
    
    out.println("Student's ID: " + student.GetID());
    out.println("Student's Name: " + student.GetName());
    out.println("Student's Major: " + student.GetMajor());
    out.println("Student's Age: " + student.GetAge());
    out.println("Student's GPA: " + student.GetGPA());
  }
}