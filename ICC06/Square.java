package ICC06;

class Square extends Shape {
  
  public String GetArea(){
    double side = Utility.GetDimension("side");
    
    return ("The area of the square is: " + (side*side));
  }
  
}