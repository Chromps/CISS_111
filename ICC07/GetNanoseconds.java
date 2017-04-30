/*
 * Name: Cameron Swift
 * Project: ICC 07
 * Files: GetFilesInDir.java, GetNanoseconds.java, Helper.java, ICC07.java
 * Date: 03.02.17
 */



import java.util.*;
import static java.lang.System.*;

public abstract class GetNanoseconds {
  public static void GetNano(){
    out.println("Current Nano Time is: " + nanoTime() + "\n");
    long start = nanoTime();
    for(int i = 0; i<100000; i++);
    long end = nanoTime();
    out.println("Start time: " + start);
    out.println("End time: " + end);
    out.println("Elapsed time: " + (end-start));
  }
  
}