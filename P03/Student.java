package P03;



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
  public void setLastName(String name){
    
  }
    
  
  
  
  
}