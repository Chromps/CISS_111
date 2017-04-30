

import static java.lang.System.*;
import java.io.*;
import java.util.*;

public abstract class Helper{
  
  private static Scanner scanner = new Scanner(in);
  public static String GetStringInput(String prompt){
    String input;
    do{
      out.print("\n" + prompt);
      input = scanner.nextLine();
      if(input == null || input.isEmpty()){
        out.println("\nYour input cannot be empty!");
      }
      
    }while(input == null || input.isEmpty());
    return input;
  }
  
  public static Double GetDoubleInput(String prompt){
    double number = 0.0;
    boolean valid = false;
    do{
      valid = true;
      try{
        number = Double.parseDouble(GetStringInput(prompt));
      }catch(Exception ex){
        out.println("Not a valid double...");
        valid = false;
      }
      
    }while(!valid);
    return number;
  }
  public static int GetIntegerInput(String prompt){
    int number = 0;
    boolean valid = false;
    do{
      valid = true;
      try{
        number = Integer.parseInt(GetStringInput(prompt));
      }catch(Exception ex){
        out.println("Not a valid integer...");
        valid = false;
      }
      
    }while(!valid);
    return number;
    
    
  }
  
  public static void PromptUser(String prompt)throws IOException{
    out.println(prompt);
    in.read();
      
  }
  
  
  
}