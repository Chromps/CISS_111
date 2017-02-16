/*
 * 
 * Name: Cameron Swift
 * 
 * Date: 1/30/17
 * 
 * Project: Project 2 -- Wallet
 * 
 * Files: Project02.java
 * 
 * 
 */

import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import static java.lang.System.*;




public class Project02 {
  
  
  public enum Money { 
    PENNY(.01), 
      NICKLE(.05), 
      DIME(.10), 
      QUARTER(.25),
      HALFDOLLAR(.50),
      ONE(1.00),
      FIVE(5.00),
      TEN(10.00),
      TWENTY(20.00),
      FIFTY(50.00),
      HUNDRED(100.00);
    
    private double value; 
    
    private Money(double value) { 
      this.value = value;
    };
    private double GetDenom(){
      return value; 
    };
  };
  
  
  
  private static Scanner scanner; 
  
  private static Vector<Money> wallet = new Vector<Money>();
  
  private static void GetWalletContents(){
    scanner = new Scanner(in);
    out.println("\n\n========== Wallet Contents ============");
    if(wallet.size() == 0){
      out.println("\nTheres nothing in there!\n");
      out.print("\n\n====================\n");
      out.print("Press ENTER to go back to main menu");
      scanner.nextLine();
      return;
    }
    else{
      out.println("The content of your wallet is:");
      MoneyMachine();
      out.print("\n\n====================\n");
      out.print("Press ENTER to go back to main menu");
      scanner.nextLine();
    }
    
  };
  
  private static void AddMoney(){
    out.println("\n\n========== Add Money ============");
    boolean validInput = false;
    scanner = new Scanner(in);
    boolean running = true;
    do{
      validInput = false;
      out.print("What would you like to add? (enter decimal denomination) enter -1 to exit ==>");
      double attempt = scanner.nextDouble();
      if(attempt == -1){
        running = false;
      }
      for(int i = 0; i<Money.values().length; i++){
        double val = Money.values()[i].GetDenom();
        if(attempt == val){
          validInput = true;
          wallet.add(Money.values()[i]);
          out.println(Money.values()[i]+" added to wallet \n\n");         
        }
      }
      
      if(!validInput){
        out.println("That was not a valid input, please try again...\n");
      }
      
    }while(running);
    
  };
  private static void RemoveMoney(){
    scanner = new Scanner(in);
    double removeMe;
    boolean valid = true;
    
    out.println("\n\n======== Remove Money ==========");
    
    do{
      if(wallet.size() == 0){
        out.println("Theres nothing to remove!");
//        scanner.nextLine();
        return;
      };
      boolean found = false;
      out.println("The content of your wallet is:");
      
      
      MoneyMachine();
      
      out.print("What would you like to remove? (enter decimal value, -1 to exit) ==>");
      removeMe = scanner.nextDouble();
      if(removeMe == -1.0){
        valid = false;
        return;
        
        
      }
      for(Money money: Money.values()){
        if(money.GetDenom() == removeMe  && wallet.indexOf(money)!=-1){
          found = true;
          wallet.remove(money);
          out.println(money + " removed from wallet\n\n");
        };   
      };
      if(!found)
        out.println("That is not in your wallet!");
    }while(valid);
  };
  
  
  private static void RemoveAllMoney(){
    
    out.println("\n\n======== Remove ALL Money ==========");
    scanner = new Scanner(in);
    if(wallet.size() == 0){
      out.println("Theres nothing to remove!");
      return;
    };
    out.println("This will remove all money from your wallet, are you sure? (y/n)");
    char input = scanner.next().toLowerCase().charAt(0);
    if(input == 'y'){
      out.println("The following were removed from your wallet:");
      MoneyMachine();
      wallet.clear();
      out.println("\nYour wallet has been emptied!\n");
      out.println("Press enter to return to Main Menu");
      scanner.nextLine();
    }
    else
      out.println("Returning to main menu with a full wallet");
    
  };
  
  private static void MoneyMachine(){
    int count;
    double value;
    double total = 0.0;
    for(int i = 0; i<Money.values().length; i++){
      count = 0;
      value = 0.0;
      if(wallet.contains(Money.values()[i])){
        for(Money money : wallet){
          if(money == Money.values()[i]){
            total += Money.values()[i].GetDenom();
            value += Money.values()[i].GetDenom();
            count++;
          }
        }
      }
      if(count>0){
        out.println(Money.values()[i] + ", Qty: " + count+ ", value: $"+ value);
      }
    }
    out.printf("======= Total =========\n     $%.2f\n", total);
    
    
    
    
  }
  
  public static void main(String[] args){
    boolean valid = true;
    do{
      scanner = new Scanner(in);
      out.println("\n================== Wallet simulator 2017 ==================\n\n");
      out.println("1)  Show money in wallet");
      out.println("2)  Add money to wallet");
      out.println("3)  Remove money from wallet");
      out.println("4)  Empty wallet");
      out.println("5)  Exit");
      out.print("What would you like to do? (enter choice number) ==>");
      int choice = Integer.parseInt(scanner.nextLine());
      switch (choice){
        case 1: 
          GetWalletContents();
          break;
        case 2: 
          AddMoney();
          break;
        case 3: 
          RemoveMoney();
          break;
        case 4: 
          RemoveAllMoney();
          break;
        case 5: 
          out.println("\n\n=========== Thanks for choosing Wallet Simulator 2017! =========\n\n");
          valid=false;
          break;
        default: out.println("Please enter a valid number!!! \n\n");
      }
    }while(valid);
    
  };
  
  
  
  
}