package ICC06;

class Triangle extends Shape {
  
  public String GetArea(){
    double base = Utility.GetDimension("base");
    double height = Utility.GetDimension("height");
    double area = (base*height)/2;
    return ("The area of the triangle is: " + area);
  }
  
}