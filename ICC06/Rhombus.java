package ICC06;

class Rhombus extends Shape {
  
  public String GetArea(){
    double diag1 = Utility.GetDimension("diagonal 1");
    double diag2 = Utility.GetDimension("diagonal 2");
    double area = (diag1*diag2)/2;
    return ("The area of the rhombus is: " + area);
  }
  
}