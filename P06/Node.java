package P06;
public class Node {
  public String cargo;
  public Node next = null; 
  
  public Node(String val, Node ref){
    this.cargo = val;
    this.next = ref;
  }
  public Node(String val){
    this.cargo = val;
    this.next = null;
  }
  
  public String getCargo(){
    return this.cargo;
  }
  public Node getNext(){
    return this.next;
  }
}
class LinkList{
  public Node firstNode;
  public int size = 0;
  
  LinkList(){
    firstNode = null;
  }
  
  public boolean isEmpty(){
    return(firstNode == null);
  }
  
  public void add(String cargo){
    Node front = new Node(cargo);
    front.next = firstNode;
    firstNode = front;
    size++;
  }
  
  
  
  public void add(String cargo, int pos){
    Node start = firstNode;
    int count = 1;
    Node newNode = new Node(cargo);
    Node previous = null;
    Node temp = null;
    size++;
    if(count == pos){
      add(cargo);
    }
    else{
      while(count < pos){
        previous = start;
        start = start.next;
        count++;
      }
      temp = start.next;
      previous.next = newNode;
      newNode.next = start;
      
    }
  }
  
  
  
  public void addToEnd(String cargo){
    Node front = firstNode;
    Node newEnd = new Node(cargo);
    
    size++;
    while(front.next != null){
      front = front.next;
    }
    front.next = newEnd;
    
  }
  public Node removeFirst(){
    Node ref = firstNode;
    
    if(!isEmpty()){
      firstNode = firstNode.next;
    }
    else{
      System.out.println("Empty List");
    }
    size--;
    return ref;
  }
  public void seeList(){
    Node pos = firstNode;
    int count = 1;
    if(firstNode != null){
      while(pos != null){
        System.out.println("Cargo: "+pos.getCargo() + ", Position: " + count);
        count++;
        pos = pos.next;
      }
    }
    else{
      System.out.println("Train is empty, please add a car to position 1");
    }
    
  }
  public void seeListNoPos(){
    Node pos = firstNode;
    int count = 1;
    if(firstNode != null){
      while(pos != null){
        System.out.println("Cargo: "+pos.getCargo());
        count++;
        pos = pos.next;
      }
    }
    else{
      System.out.println("Train is empty, please add a car to position 1");
    }
    
  }
    
  
  public Node removePos(int pos){
    Node first = firstNode;
    Node previous = firstNode;
    int placeInTrain = 1;
    
    while(placeInTrain != pos){
      if(first.next == null){
        return null;
      } else{
        previous = first;
        first = first.next;
      }
      placeInTrain++;
    }
    if(first == firstNode){
      firstNode = firstNode.next;
    } else {
      previous.next = first.next;
    }
    size--;
    return first;
  }
  
}