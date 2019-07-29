package linkList;
import linkList.InsertInLinkList;
public class CountTimes extends InsertInLinkList{
  public int countTimes(Node head, int data){
    int count = 0 ;
    Node n = head;
    while(n!=null){
      if(n.data== data){
        count++;
      }
      n = n.next;
    }
    return count;
  }
  public static void main(String[] args) {
    CountTimes obj = new CountTimes();
    obj.head = new Node(4);
    obj.append(obj.head,3);
    obj.append(obj.head,2);
    obj.append(obj.head,3);
    obj.append(obj.head,3);
    int count = obj.countTimes(obj.head,3);
    System.out.println("Frequency : " + count);
  }
}
