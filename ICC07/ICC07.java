/*
 * Name: Cameron Swift
 * Project: ICC 07
 * Files: GetFilesInDir.java, GetNanoseconds.java, Helper.java, ICC07.java
 * Date: 03.02.17
 */




import java.io.*;
import static java.lang.System.*;

public class ICC07 {
  public static void main(String[] args) throws IOException{
    int choice = 0;
    do{
      out.println("Main Menu");
      out.println("**************************");
      out.println("1) Show Nano Seconds elapsed");
      out.println("2) Show files in Directory");
      out.println("3) Exit");
      out.println("**************************");
      choice = Helper.GetIntegerInput("Choose from menu..");
      switch(choice){
        case 1:
           GetNanoseconds.GetNano();
          break;
        case 2:
           GetFilesInDir.GetFiles();
          break;
        case 3:
           Helper.PromptUser("Press enter to exit...");
          break;
        default:
          Helper.PromptUser("That was not a selection, press enter to continue...");
          break;
          
      }
      
    }while(choice!=3);
  
  }
  
}