package ICC06;

class Rectangle extends Shape {
  
  public String GetArea(){
    double length = Utility.GetDimension("length");
    double width = Utility.GetDimension("width");
    return ("The area of the rectangle is: " + width*length);
  }
  
}