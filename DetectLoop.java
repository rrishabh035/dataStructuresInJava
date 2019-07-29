package linkList ;
import linkList.InsertInLinkList;
import java.util.*;
public class DetectLoop extends InsertInLinkList{
  public void detectLoop(Node head){
    HashSet<Node> store = new HashSet<Node>();
    Node n = head ;
    int flag = 0;
    while(n!=null){
      if(store.contains(n.next)){
        flag = 1;
        break;
      }
      else{
        store.add(n.next);
      }
      n = n.next;
    }
    if(flag == 1){
      System.out.println("Loop Detected");
    }
  }

  public int lengthOfLoop(Node head){
    HashSet<Node> store = new HashSet<Node>();
    Node n = head ;
    int flag = 0,count = 2;
    while(n!=null){
      if(store.contains(n.next)){
        flag = 1;
        break;
      }
      else{
        store.add(n.next);
      }
      n = n.next;
    }
    if(flag == 1){
      Node temp = n;
      n = n.next;
      while(n.next!=temp){
        count ++;
        n = n.next;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    DetectLoop obj = new DetectLoop();
    obj.head = new Node(4);
    obj.append(obj.head,3);
    obj.append(obj.head,2);
    obj.append(obj.head,3);
    obj.append(obj.head,3);
    Node n = obj.head;
    while(n.next != null){
      n = n.next;
    }
    n.next = obj.head;
    obj.detectLoop(obj.head);
    System.out.println("Length Of Loop Created :" + obj.lengthOfLoop(obj.head));
  }
}
