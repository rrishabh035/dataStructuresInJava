package linkList;
import linkList.InsertInLinkList;
import java.util.*;
public class RemoveDuplicate extends InsertInLinkList{
  public void removeDuplicateS(Node head){
    Node n = head,temp;
    while(n!=null){
      temp = n;
      try {
      while(n.data==n.next.data){
        if(n.next == null){
          break;
        }
        n = n.next;
      }
    } catch(Exception e) {

    }
      temp.next = n.next;
      n = n.next;
    }
  }
  public void removeDuplicateUS(Node head){
    Node n = head,temp;
    HashSet<Integer> store = new HashSet<Integer>();
    while(n!=null){
      if(!store.contains(n.data)){
        store.add(n.data);
      }
      n = n.next;
    }
      head.next = null;
      Iterator<Integer> itr = store.iterator();
      int count = 1;
      while(itr.hasNext()){
        if(count!=1){
        append(head,itr.next());
        }
        else{
        itr.next();
        }
        count ++;
      }
    }

  public static void main(String[] args) {
    RemoveDuplicate obj = new RemoveDuplicate();
    obj.head = new Node(1);
    obj.append(obj.head,3);
    obj.append(obj.head,3);
    obj.append(obj.head,3);
    obj.append(obj.head,3);
    obj.append(obj.head,4);
    obj.append(obj.head,4);
    obj.removeDuplicateS(obj.head);
    obj.traverse(obj.head);
    System.out.println("Removing Unsorted Duplicate Elements");
    RemoveDuplicate obj1 = new RemoveDuplicate();
    obj1.head = new Node(1);
    obj1.append(obj1.head,3);
    obj1.append(obj1.head,3);
    obj1.append(obj1.head,3);
    obj1.append(obj1.head,3);
    obj1.append(obj1.head,4);
    obj1.append(obj1.head,4);
    obj1.removeDuplicateUS(obj1.head);
    obj1.traverse(obj1.head);
  }
}
