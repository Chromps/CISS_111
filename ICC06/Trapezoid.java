package ICC06;

class Trapezoid extends Shape {
  
  public String GetArea(){
    double smallBase = Utility.GetDimension("small base");
    double largeBase = Utility.GetDimension("large base");
    double height = Utility.GetDimension("height");
    double area = (smallBase+largeBase)*height / 2;
    return ("The area of the trapezoid is: " + area);
  }
  
}