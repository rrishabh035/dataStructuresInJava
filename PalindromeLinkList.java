package linkList;
import linkList.InsertInLinkList;
import java.util.*;
public class PalindromeLinkList extends InsertInLinkList{
  public void palindromeCheck(Node head){
    Node n = head;
    ArrayList<Integer> store = new ArrayList<Integer>();
    while(n.next!=null){
      store.add(n.data);
      n = n.next;
    }
    ArrayList<Integer> storeTemp = store;
    Collections.reverse(store);
    if(storeTemp.equals(store)){
      System.out.println("Match Successful  : It is Palindrome");
    }
  }

  public static void main(String[] args) {
    PalindromeLinkList obj = new PalindromeLinkList();
    obj.head = new Node(1);
    obj.append(obj.head,1);
    obj.append(obj.head,1);
    obj.append(obj.head,1);
    obj.append(obj.head,1);
    obj.palindromeCheck(obj.head);
  }
}
