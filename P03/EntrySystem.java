package P03;


/*
 * Name: Cameron Swift
 * Project: Project 3
 * Files: Employee.java, EntrySystem.java, Student.java
 * Date: 03/02/2014
 */

import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class EntrySystem {
  
  
  public static ArrayList<Student> Students = new ArrayList<Student>();
  public static ArrayList<Employee> Employees = new ArrayList<Employee>();
  public static ArrayList<String> Jokes = new ArrayList<String>();
  private static Scanner scanner;
  
  public static void main(String[] args)throws IOException{
    String selection;
    scanner = new Scanner(in);
    populateJokes();
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
          out.println("Bye");
          
      }
      
    }while(selection.charAt(0) != '9');
    
  }
  
  private static void AddStudent()throws IOException{
    String input;
    char temp;
    double grade;
    int age;
    boolean status = false;
    scanner = new Scanner(in);
    Student student = new Student();
    
    
    out.println("======== Add Student =======\n");
    out.println("This process will take you through adding a new student");
    
    do{
      status = false;
      out.print("Please enter the Student's first name:");
      input = scanner.nextLine();
      out.println(input + " was selected as first name, is this correct?(y/n)");
      temp = scanner.nextLine().charAt(0);
      if(temp == 'y'){
        student.setFirstName(input);
        status = true;
      }else{
        out.println("Please retry");
      }
      
    }while(status == false);
    do{
      status = false;
      out.print("Please enter the Student's last name:");
      input = scanner.nextLine();
      out.println(input + " was selected as last name, is this correct?(y/n)");
      temp = scanner.nextLine().charAt(0);
      if(temp == 'y'){
        student.setLastName(input);
        status = true;
      }else{
        out.println("Please retry");
      }
      
    }while(status == false);
    do{
      status = false;
      out.print("Please enter the Student's GPA:");
      input = scanner.nextLine();
      grade = Double.parseDouble(input);
      out.println(grade + " was selected as GPA, is this correct?(y/n)");
      temp = scanner.nextLine().charAt(0);
      if(temp == 'y'){
        student.setGPA(grade);
        status = true;
      }else{
        out.println("Please retry");
      }
      
    }while(status == false);
    do{
      status = false;
      out.print("Please enter the Student's age:");
      input = scanner.nextLine();
      age = Integer.parseInt(input);
      out.println(age + " was selected as age, is this correct?(y/n)");
      temp = scanner.nextLine().charAt(0);
      if(temp == 'y'){
        student.setAge(age);
        status = true;
      }else{
        out.println("Please retry");
      }
      
    }while(status == false);
    do{
      status = false;
      out.print("Please enter the Student's major:");
      input = scanner.nextLine();
      out.println(input + " was selected as major, is this correct?(y/n)");
      temp = scanner.nextLine().charAt(0);
      if(temp == 'y'){
        student.setMajor(input);
        status = true;
      }else{
        out.println("Please retry");
      }
      
    }while(status == false);
    
    
    out.println("Success!! the details of your student are:\n");
    out.println(student.toString());
    out.println("Add student to list? (y/n)");
    temp = scanner.nextLine().charAt(0);
    if(temp == 'y'){
      Students.add(student);
      out.println("success! returning to main menu.");
    }else{
      out.println("Student not added to list, returning to main menu.");
    }
    
    
    
    
  }
  private static void AddEmployee()throws IOException{
    String input;
    char temp;
    double salary;
    Boolean status;
    Employee newEmp = new Employee();
    do{
      status = false;
      out.print("Please enter the Employee's first name:");
      input = scanner.nextLine();
      out.println(input + " was selected as first name, is this correct?(y/n)");
      temp = 'n';
      temp = scanner.nextLine().charAt(0);
      if(temp == 'y'){
        newEmp.setFirstName(input);
        status = true;
      }else{
        out.println("Please retry");
      }
      
    }while(status == false);
    do{
      status = false;
      out.print("Please enter the Employee's last name:");
      input = scanner.nextLine();
      out.println(input + " was selected as last name, is this correct?(y/n)");
      temp = 'n';
      temp = scanner.nextLine().charAt(0);
      if(temp == 'y'){
        newEmp.setLastName(input);
        status = true;
      }else{
        out.println("Please retry");
      }
     }while(status == false);
     do{
      status = false;
      out.print("Please enter the Employee's department:");
      input = scanner.nextLine();
      out.println(input + " was selected as department, is this correct?(y/n)");
      temp = 'n';
      temp = scanner.nextLine().charAt(0);
      if(temp == 'y'){
        newEmp.setDepartment(input);
        status = true;
      }else{
        out.println("Please retry");
      }
      
    }while(status == false);
    do{
      status = false;
      out.print("Please enter the Employee's salary:");
      input = scanner.nextLine();
      salary = Double.parseDouble(input);
      out.println(salary + " was selected as salary, is this correct?(y/n)");
      temp = 'n';
      temp = scanner.nextLine().charAt(0);
      if(temp == 'y'){
        newEmp.setSalary(salary);
        status = true;
      }else{
        out.println("Please retry");
      }
      
    }while(status == false);
    
    out.println("Congratulations! Your new employee has been created:");
    out.println(newEmp.toString());
    out.println("\nAdd employee to database?(y/n)");
    temp = scanner.nextLine().charAt(0);
    if(temp == 'y'){
      Employees.add(newEmp);
      out.println("Success, returning to main menu");
    }
    else{
      out.println("Too bad, they seemed so promising. Returning to main menu");
    }
    
    
     
   
    
  }
  private static void ViewStudents(){
    scanner = new Scanner(in);
    out.println("========== All Students ==========\n");
    if(Students.size() == 0){
      out.println("There are no students!");
    }else{
    for(Student student: Students){
      out.println(student.toString());
      out.println("=================================");
    }
    }
    out.println("Press enter to return to main menu.");
    scanner.nextLine();
    
  }
  private static void ViewEmployees(){
    scanner = new Scanner(in);
    out.println("========== All Employees ==========\n");
    if(Employees.size() == 0){
      out.println("There are no employees!!");
    }else{
    for(Employee emp: Employees){
      out.println(emp.toString());
      out.println("=================================");
    }
    }
    out.println("Press enter to return to main menu.");
    scanner.nextLine();
    
  }
  private static void ClearStudents(){
    scanner = new Scanner(in);
    char temp;
    out.print("WARNING! This will erase ALL students! proceed?(y/n)");
    temp = scanner.nextLine().charAt(0);
    
    if(temp == 'y'){
      Students.clear();
      out.println("All students removed from list");
    }else{
      out.println("Good choice, returning to main menu");
    }
  }
  private static void ClearEmployees(){
    scanner = new Scanner(in);
    char temp;
    out.print("WARNING! This will erase ALL employees! proceed?(y/n)");
    temp = scanner.nextLine().charAt(0);
    
    if(temp == 'y'){
      Employees.clear();
      out.println("All employees removed from list");
    }else{
      out.println("Good choice, returning to main menu");
    }
    
  }
  private static void SeeJokes(){
    int count = 0;
    scanner = new Scanner(in);
    out.println("========= List of all known jokes ========");
    for(String joke: Jokes){
      out.println("Joke #"+(count+1));
      out.println(joke);
      count++;
      out.println("========================================");
    }
    out.println("Pretty good, huh? Press enter when you finish laughing");
    scanner.nextLine();
    
  }
  private static void TellJoke() throws IOException{
    
    try{
      int size = Jokes.size();
    Random rand = new Random();
    out.println("========= Joke Time ========\n\n");
    out.println(Jokes.get(rand.nextInt(size)) + "\n\n");
    out.println("============================");
    out.print("Press any key to continue");
    in.read();
    }
    catch(Exception ex){
      out.println("no");
    }
    
   
    
  }
  private static void populateJokes(){
    Jokes.clear();
    Jokes.add("\"Knock, knock.\"\n\"Who's there?\"\n\nA very long pause...\n\n\"Java!\"");
    Jokes.add("Eight bytes walk into a bar. The bartender asks if they'd like anything.\n\"Yeah\" they replied \"Make us a double\"");
    Jokes.add("Q. How did the programmer die in the shower?\nA. He read the shampoo bottle instructions: Lather. Rinse. Repeat.");
    Jokes.add("From the Random Shack Data Processing Dictionary:\n\nEndless Loop: n., see Loop, Endless.\nLoop, Endless: n., see Endless Loop.");
    Jokes.add("What do you call a program that solves climate change?\n\nAn Al-Gore-ithm!\n\nBa-dum-tsh..");
    
  }
  
}