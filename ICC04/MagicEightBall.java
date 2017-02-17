/*
 * 
 * Name: Cameron Swift
 * 
 * Date: Feb, 15 2017
 * 
 * Project: In class coding 04
 * 
 * files: MagicEightBall.java, Saying.java
 * 
 */


package ICC04;


import java.util.*;
import static java.lang.System.*;

public class MagicEightBall{
  
  private static ArrayList<Saying> sayings = new ArrayList<Saying>();
  private static Random rand = new Random();
  
  private static int GetRandomNumber(int max){
    return rand.nextInt(max)+1;
  }
  
  private static void DeclareSayings(){
    sayings = new ArrayList<Saying>();
    sayings.add(new Saying("It is certain"));
    sayings.add(new Saying("It is decidedly so"));
    sayings.add(new Saying("Without a doubt"));
    sayings.add(new Saying("Yes, definitely"));
    sayings.add(new Saying("You may rely on it"));
    sayings.add(new Saying("As I see it, yes"));
    sayings.add(new Saying("Most likely"));
    sayings.add(new Saying("Outlook good"));
    sayings.add(new Saying("Yes"));
    sayings.add(new Saying("Signs point to yes"));
    sayings.add(new Saying("Reply hazy try again"));
    sayings.add(new Saying("Ask again later"));
    sayings.add(new Saying("Better not tell you now"));
    sayings.add(new Saying("Cannot predict now"));
    sayings.add(new Saying("Concentrate and ask again"));
    sayings.add(new Saying("Don't count on it"));
    sayings.add(new Saying("My reply is no"));
    sayings.add(new Saying("My sources say no"));
    sayings.add(new Saying("Outlook not so good"));
    sayings.add(new Saying("Very doubtful"));
    
  }
  private static Saying GetSaying(){
    int size = sayings.size();
    int pos = GetRandomNumber(size)-1;
    sayings.get(pos).Increment();
    return sayings.get(pos);
  }
  public static void main(String[] args){
    DeclareSayings();
    Saying s;
    
    for(int i = 0; i < 40; i++){
      s = GetSaying();
      out.println(s.getText());
    }
    for(int i = 0; i < sayings.size(); i++){
      s = sayings.get(i);
      out.println("Saying: \""+ s.getText() + "\", Count: " + s.getCount());
      
    }
    
  }
  
}