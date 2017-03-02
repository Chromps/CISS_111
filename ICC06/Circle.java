
package ICC06;

import java.lang.Math;

class Circle extends Shape {
  
  public String GetArea(){
    double radius = Utility.GetDimension("radius");
    double area = Math.pow(radius, 2)*Math.PI;
    return ("The area of the circle is: " + area);
  }
  
}