package linkList ;
import linkList.InsertInLinkList;
public class FindLength extends InsertInLinkList{
  public int findLengthI(Node head){
    Node n = head;
    int count = 0;
    while(n.next!=null){
      count++;
      n = n.next;
    }
    return count +1 ;
  }
  public int findLengthR(Node head){
    Node n = head;
    if(n.next!=null){
      return 1 + findLengthR(n.next);
    }
    else{
      return 1;
    }
  }

  public static void main(String[] args) {
    FindLength obj = new FindLength();
    obj.head = new Node(10);
    obj.append(obj.head, 90);
    obj.append(obj.head, 90);
    obj.append(obj.head, 90);
    obj.append(obj.head, 90);
    int r = obj.findLengthR(obj.head);
    System.out.println("Length Using Recursion: "+ r);
    int i = obj.findLengthI(obj.head);
    System.out.println("Length Using Iteration: "+ i);
  }
}
