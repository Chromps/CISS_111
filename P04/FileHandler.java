/*
 * Name: Cameron Swift
 * Project 4
 * Date: 03/14/17
 * Files: FileHandler.java, Helper.java & 'files' directory
 */
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class FileHandler{
  public static void main(String[] args) throws IOException{
    Scanner scanner = new Scanner(in);
    char choice;
    do{
      choice = '0';
      out.println("Please choose an option from the following menu:");
      out.println("------------------------------------------------");
      out.println("l) List all files in current directory");
      out.println("a) Add a new file");
      out.println("v) View a specific file");
      out.println("d) Delete a file");
      out.println("q) Quit");
      out.println("------------------------------------------------");
      out.print("Please enter the letter of the option you would like to choose:");
      try{
      choice = scanner.nextLine().charAt(0);
      choice = Character.toLowerCase(choice);
      }
      catch(StringIndexOutOfBoundsException ex){
        out.println(ex.getMessage());
      }
      switch(choice){
        case 'l':
          Helper.GetFiles();
          Helper.PromptUser("Press enter to return to main menu");
          break;
        case 'a':
          Helper.newFile();
          break;
        case 'v':
          Helper.readFile();
          break;
        case 'd':
          Helper.deleteFile();
          break;
        case 'q':
          out.println("Ok, bye.");
          System.exit(0);
          break;
      default:
        out.println("Thats not a valid option, dude!\n");
    }
      
    }while(choice != 'q');
    
    
    
    
    
  }
  
  
  
}