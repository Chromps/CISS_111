/*

Name: Cameron Swift

Date: 01/20/2017

Project: Project 1

File: Project1.java

*/

import static java.lang.System.*;
import java.util.*;

public class Project1 {
  public static void main(String[] args){
      String operator = args[args.length-1];
      int result = 0;
      if(operator.equals("+")){
        for(int i = 0; i<args.length-1; i++){
          String print = i<args.length-2? args[i]+" + " : args[i];
          out.print(print);
          result += Integer.parseInt(args[i]);
        }
      }
      else{
        for(int j = 0; j<args.length-1; j++){
          String printNegative = j<args.length-2? args[j]+" - " : args[j];
          out.print(printNegative);
          result -= Integer.parseInt(args[j]);
        }
      }
      
      out.println( " = " + result);
      
   }  
}
