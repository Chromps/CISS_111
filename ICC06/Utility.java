package ICC06;

import java.io.*;
import java.util.*;
import static java.lang.System.*;


abstract class Utility{
  public static void PromptUser(String prompt) throws IOException{
    out.println(prompt + "\n");
    in.read();
    
  }
  public static double GetDimension(String whichDimension){
    Scanner sc = new Scanner(in);
    double dimension = 0.0;
    do{
      try{
        out.println("Please enter the dimension for the " + whichDimension + "\n");
        dimension = Double.parseDouble(sc.nextLine());
        if(dimension <= 0.0){
          out.println("Your dimension cannot be less than 0");
        }
      }catch(Exception ex){
        out.println("You need to enter a non-negative number.");
        dimension = 0.0;
        
      }
    }while(dimension <= 0.0);
    
    return dimension;
    
    
  }
  
  
}