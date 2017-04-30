package P06;
import static java.lang.System.*;

public class P06{
  public static void addNode(Node n){
    
    
  }
  public static LinkList train = new LinkList();
  public static LinkList rejects = new LinkList();
  public static void main(String[] args){
    out.println("Linked list train\n\n");
    int selection;
    do{
      
      out.println("------------  Main Menu  ------------\n\n");
      out.println("1) Add a car to the train.");
      out.println("2) Add a car to the back of the train.");
      out.println("3) Add a car to the train at a specific position.");
      out.println("4) Remove the first car from the train.");
      out.println("5) Remove the last car from the train.");
      out.println("6) Remove a car from the train at a specific position.");
      out.println("7) View the train and all of its cars.");
      out.println("8) View all of the removed cars.");
      out.println("9) Remove all of the trains cars.");
      out.println("10) Exit");
      out.println("------------------------------------");
      selection = Helper.GetIntegerInput("Please make a selection (1-10):");
      switch (selection){
        case 1:
          option1();
          break;
        case 2:
          option2();
          break;
        case 3:
          option3();
          break;
        case 4:
          option4();
          break;
        case 5:
          option5();
          break;
        case 6:
          option6();
          break;
        case 7:
          option7();
          break;
        case 8:
          option8();
          break;
        case 9:
          option9();
          break;
        case 10:
          out.println("Bye");
          exit(0);
          break;   
      } 
    }while(selection != 10);
  }
  public static void option1(){
    out.println("---------- Add car to front ----------\n");
    String cargo = Helper.GetStringInput("Enter train car contents: ");
    train.add(cargo);
    out.println("\n\n------------- Car Added ------------\n");
    Helper.PromptUser("\nCar added to the front of the train, press enter to continue");
    
  }
  public static void option2(){
    out.println("---------- Add car to end -----------\n");
    String cargo = Helper.GetStringInput("Enter train car contents: ");
    train.addToEnd(cargo);
    out.println("\n\n------------- Car Added ------------\n");
    Helper.PromptUser("Car added to the end of the train, press enter to continue");
    
  }
  public static void option3(){
    out.println("---------- Add new car at position ---------\n");
    String cargo = Helper.GetStringInput("Enter train car contents: ");
    int pos = 0;
    if(train.size != 0){
      int max = train.size;
      do{
        train.seeList();
        pos = Helper.GetIntegerInput("\nWhat position would you like the car added in? "+ (max+1)+ " is valid and will add the car to end of train.");
        if(pos <= 0 || pos > max+1){
          out.println("\nERROR :: Please choose a valid position! (1-" + (max+1) +")\n");
        }
      }while(pos <= 0 || (pos > max+1));
      
      if(pos <= max){
        train.add(cargo, pos);
      }
      else if(pos == max+1){
        out.println(train.size);
        train.addToEnd(cargo);
      }
    }
    else{
      out.println("\nEmpty train, adding first car!\n");
      train.add(cargo);
    }
    out.println("\n\n------------- Car Added ------------\n");
    Helper.PromptUser("Press enter to continue");
  }
  
  public static void option4(){
    out.println("-------- Remove first car ---------\n");
    if(train.size == 0){
      out.println("\n\tNo cars to remove...\n");
      
    }else{
    Node removed = train.removeFirst();
    rejects.add(removed.cargo);
    }
    out.println("--------------- Done --------------\n");
    Helper.PromptUser("Press enter to continue...");
  }
  public static void option5(){
    out.println("-------- Remove last car ---------\n");
    if(train.size == 0){
      out.println("\n\tNo cars to remove...\n");
      
    }else{
    Node removed = train.removePos(train.size);
    rejects.add(removed.cargo);
    }
    out.println("-------------- Done --------------\n");
    Helper.PromptUser("Press enter to continue...");
  }
  public static void option6(){
    out.println("-------- Remove car by position ---------\n");
    int pos = 0;
    if(train.size == 0){
      out.println("\n\tNo cars to remove...\n");
      
    }else{
    do{
      train.seeList();
      pos = Helper.GetIntegerInput("Which car would you like to remove?");
      if(pos<=0 || pos>train.size){
        out.println("\nERROR :: Please choose a valid position! (1-" + train.size +")\n");
      }
    }while(pos<=0 || pos>train.size);
    Node rem = train.removePos(pos);
    rejects.add(rem.cargo);
    out.println("\n-------------- Car Removed ------------\n");
    }
    Helper.PromptUser("Press enter to continue...");
  }
  public static void option7(){
    out.println("-----------  Train Contents  -----------\n");
    train.seeList();
    out.println("\n----------------------------------------\n");
    Helper.PromptUser("Press enter to continue...");
    
  }
  public static void option8(){
    out.println("-----------  Train Contents  -----------\n");
    rejects.seeListNoPos();
    out.println("\n----------------------------------------\n");
    Helper.PromptUser("Press enter to continue...");
    
  }
  public static void option9(){
    out.println(" ------ Removing all cars from train ------\n");
    out.println("processing...");
    Node first = train.firstNode;
    while(first.next != null){
      rejects.add(first.cargo);
      first = first.next;
    }
    rejects.add(first.cargo);
    train.firstNode = null;
    train.size = 0;
    out.println("\n--------------- Done --------------\n");
    Helper.PromptUser("Press enter to continue...");
  }
}