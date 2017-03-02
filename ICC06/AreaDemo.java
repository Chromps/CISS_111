/*
 * name: Cameron Swift
 * 
 * date: 2/23/17
 * 
 * project: ICC06
 * 
 * files: AreaDemo, Circle, Rectangle, Rhombus, Shape, Square, Trapezoid, Triangle, Utility
 * 
 */


package ICC06;

import java.io.*;
import java.util.*;
import static java.lang.System.*;


public class AreaDemo{
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(in);
    int selection=0;
    do{
      try{
        out.println("\n\nSelect a shape to get the area of:");
        out.println("\t1) Square(side squared)");
        out.println("\t2) Rectangle (length * width)");
        out.println("\t3) Circle (Pi * r squared");
        out.println("\t4) Triangle (1/2 base * height)");
        out.println("\t5) Rhombus ( 1/2 diagonal 1 * diagonal 2)");
        out.println("\t6) Trapezoid ( 1/2 height * small base + large base )");
        out.println("\t7) Quit.");
        out.println("\nWhich would you like to get the area of?");
        selection = Integer.parseInt(sc.nextLine());
        
        switch (selection) {
          case 1:
            Square square = new Square();
            out.println(square.GetArea());
            Utility.PromptUser("Press any key to continue...");
            break;
          case 2:
            Rectangle rect = new Rectangle();
            out.println(rect.GetArea());
            Utility.PromptUser("Press any key to continue...");
            break;
          case 3:
            Circle circle = new Circle();
            out.println(circle.GetArea());
            Utility.PromptUser("Press any key to continue...");
            break;
          case 4:
            Triangle tri = new Triangle();
            out.println(tri.GetArea());
            Utility.PromptUser("Press any key to continue...");
            break;
          case 5:
            Rhombus rhom = new Rhombus();
            out.println(rhom.GetArea());
            Utility.PromptUser("Press any key to continue...");
            break;
          case 6:
            Trapezoid trap = new Trapezoid();
            out.println(trap.GetArea());
            Utility.PromptUser("Press any key to continue...");
            break;
          case 7:
            out.println("Ok goodbye");
            break;
          default:
            out.println("That wasn't a valid menu selection.");
            break;
          
          
        }
        
        
      }catch(Exception ex){
        out.println("That was not a number between 1 and 7!\n");
        selection = 0;
      }
      
    }while(selection != 7);
    
  }
}