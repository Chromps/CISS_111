/*

Name: Cameron Swift

Date: 01/19/2017

Project: In Class Coding 1

File: ICC01.java

*/

import static java.lang.System.*;
import java.util.*;

public class ICC01 {
  public static void main(String[] args){
      // print original list
      out.print("The names are: ");
      for (int i = 0; i<args.length; i++){
        out.print(args[i]+ " ");
      }
      out.println();
      // sort 'em
      Arrays.sort(args);
      out.print("The sorted names are: ");
      for (int i = 0; i<args.length; i++){
        out.print(args[i] + " ");
      }
      out.println();
   }  
}
