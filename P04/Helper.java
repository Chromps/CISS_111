/*
 * Name: Cameron Swift
 * Project 4
 * Date: 03/14/17
 * Files: FileHandler.java, Helper.java & 'files' directory
 */

import static java.lang.System.*;
import java.io.*;
import java.util.*;

public abstract class Helper{
  private static ArrayList<String> results = new ArrayList<String>();
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
    out.print(prompt);
    in.read();
    
  }
  
  public static void GetFiles(){
    results.clear();
    out.println("The following files are in the 'files' subfolder:");
    out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    try{
      
      File[] files = new File("./files/").listFiles();
      if(files.length > 0){
        for(int i = 0; i<files.length; i++){
          if(files[i].isFile()){
            results.add(files[i].getName());
            out.println((i+1) + ")  " +files[i].getName());
            
          }
          
        }
      }
      else{
        out.println("There are no files in the directory");
      }
    }
    catch(NullPointerException ex){
      
      out.println("No Files in directory. " + ex.getMessage());
    }
    catch(Exception ex){
      out.println("Generic Exception. " + ex.getMessage());
    }
    finally{
      out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    
    
  }
  public static void newFile(){
    Scanner scanner = new Scanner(in);
    String fileName = "./files/file_" + nanoTime() + ".txt";
    String input;
    try{
      PrintWriter output = new PrintWriter(fileName);
      out.println("New file created at " + fileName);
      out.println("Enter the information you would like to store in the file:");
      do{
        input = "";
        input = scanner.next();
        out.println(input);
        if(input.length() == 1 && input.charAt(0) == 'x' || input.charAt(0) == 'X'){
          input = "x";
        }
        else{
          output.println(input);
        }
        
      }while(input != "x");
      output.close();
    }
    catch(FileNotFoundException e){
      out.println("File does not exist or cannot be created" + e.getMessage());
    }
    catch(Exception ex){
      out.println("Generic exception" + ex.getMessage());
      
    }
    
  }
  
  public static void readFile() throws IOException{
    Scanner scanner = new Scanner(in);
    String file;
    boolean fileRead = false;
    int choice;
    GetFiles();
    if(results.size() > 0){
      do{
        choice = GetIntegerInput("Enter the number of the file you would like to read")-1;
        try{
          
          Scanner fileReader = new Scanner(new FileReader("./files/" + results.get(choice)));
          if(!fileReader.hasNext()){
            
            fileRead = true;
            out.println("The file " + results.get(choice) + " is empty!");
            PromptUser("Press enter to return to main menu");
          }
          else if(fileReader.hasNext()){
            
            fileRead = true;
            out.println("Contents of file: " +results.get(choice));
            out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            while(fileReader.hasNext()){
              out.println(fileReader.nextLine());
            }
            out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            PromptUser("Press enter to return to main menu");
          }
        }
        catch(IndexOutOfBoundsException ar){
          fileRead = false;
          out.println("That was not a valid choice.. " + ar.getMessage());
        }
        catch(Exception ex){
          out.println("Generic Exception. " + ex.getMessage());
        }
      }while(fileRead == false);
    }
    else{
      PromptUser("Press enter to return to main menu");
    }
    
    
    
  }
  public static void deleteFile() throws IOException{
    Scanner scanner = new Scanner(in);
    boolean deleted = false;
    String file;
    int choice;
    
    GetFiles();
    if(results.size() > 0){
      do{
        choice = GetIntegerInput("Enter the number of the file you would like to delete")-1;
        try{
          File deleteMe = new File("./files/"+results.get(choice));
          if(deleteMe.exists()){
            
            deleteMe.delete();
            deleted = true;
            out.println("file '" + results.get(choice) + "' has been deleted.");
          }
          else{
            out.println("That file does not exist");
          }
        }
        catch(IndexOutOfBoundsException ex){
          out.println("That was an invalid input " + ex.getMessage());
        }
        catch(Exception ex){
          out.println("Generic Exception. " + ex.getMessage());
        }
      }while(deleted == false);
    }
    else{
      PromptUser("Press enter to return to main menu");
    }
  }
}