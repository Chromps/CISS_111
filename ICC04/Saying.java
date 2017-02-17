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


public class Saying{
  
  private String text;
  private int count;
  
  public Saying(){
    
  }
  public Saying(int count){
    this.text = "";
    this.count = count;
  }
  public Saying(String text){
    this.text = text;
    this.count = 0;
  }
  public Saying(String text, int count){
    this.text = text;
    this.count = count;
  }
  
  public void Increment(){
    count++;
  }
  
  public void setText (String text){
    this.text = text;
  }
  public String getText(){
    return text;
  }
  public void setCount (int count){
    this.count = count;
  }
  public int getCount(){
    return count;
  }
  
}