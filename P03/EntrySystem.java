package P03;

import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class EntrySystem {
  
  
  public ArrayList<Student> Students = new ArrayList<Student>();
  public ArrayList<Employee> Employees = new ArrayList<Employee>();
  public ArrayList<String> Jokes = new ArrayList<String>();
  private static Scanner scanner;
  
  public static void main(String[] args){
    String selection;
    scanner = new Scanner(in);
    do{
      out.println("1) Add a Student");
      out.println("2) Add an Employee");
      out.println("3) View All Students");
      out.println("4) View All Employees");
      out.println("5) Clear All Students");
      out.println("6) Clear All Employees");
      out.println("7) See All Jokes");
      out.println("8) Tell Me a Joke");
      out.println("9) Exit");
      out.print("Please make a selection from the menu");
      selection = scanner.nextLine();
      switch(selection){
        case "1":
          try{
          AddStudent();
        }catch(Exception ex){
          out.println("There was an issue");
        }
          break;
        case "2":
          try{
          AddEmployee();
        }catch(Exception ex){
          out.println("There was an issue");
        }
          break;
        case "3":
          ViewStudents();
          break;
        case "4":
          ViewEmployees();
          break;
        case "5":
          ClearStudents();
          break;
        case "6":
          ClearEmployees();
          break;
        case "7":
          SeeJokes();
          break;
        case "8":
          TellJoke();
          break;
        default:
          out.println("Nope");
        
      }
      
    }while(selection.charAt(0) != '9');
    
  }
  
  private static void AddStudent()throws IOException{
    String input;
    double grade;
    int age;
    boolean status = false;
    scanner = new Scanner(in);
    Student student = new Student();
    
    
    out.println("======== Add Student =======\n");
    out.println("This process will take you through adding a new student");
    out.print("Please enter the Student's first name:");
    do{
        input = scanner.nextLine();

    }while(status == false);
    
    
  }
  private static void AddEmployee()throws IOException{
    
  }
  private static void ViewStudents(){
    
  }
  private static void ViewEmployees(){
    
  }
  private static void ClearStudents(){
    
  }
  private static void ClearEmployees(){
    
  }
  private static void SeeJokes(){
    
  }
  private static void TellJoke(){
    
  }
  
}