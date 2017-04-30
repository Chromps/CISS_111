/*
 * Name: Cameron Swift
 * Project: ICC 07
 * Files: GetFilesInDir.java, GetNanoseconds.java, Helper.java, ICC07.java
 * Date: 03.02.17
 */


import java.util.*;
import java.io.*;
import static java.lang.System.*;

public abstract class GetFilesInDir {
  public static void GetFiles(){
    try{
      ArrayList<String> results = new ArrayList<String>();
      File[] files = new File("./files/").listFiles();
      for(int i = 0; i<files.length; i++){
        if(files[i].isFile()){
          results.add(files[i].getName());
          out.println(files[i].getName());
          
        }
        
      }
    }
    catch(NullPointerException ex){
      
      out.println("No Files in directory. " + ex.getMessage());
    }
    catch(Exception ex){
      out.println("Generic Exception. " + ex.getMessage());
    }
    
    
  }
}