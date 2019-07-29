package linkList;
import linkList.InsertInLinkList;
public class GetNode extends InsertInLinkList{
  public Node getNode(Node head, int data){
    Node n = head ;
    while(n.next != null){
      if(n.data == data){
        return n;
      }
      n = n.next;
    }
    return null;
  }
  public Node getMidNode(Node head){
    Node slow = head;
    Node fast = head;
    while(fast.next!=null && slow.next!=null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
  public static void main(String[] args) {
    GetNode obj = new GetNode();
    obj.head = new Node(4);
    obj.append(obj.head,3);
    obj.append(obj.head,2);
    obj.append(obj.head,1);
    obj.append(obj.head,0);
    Node temp = obj.getNode(obj.head,3);
    System.out.println("Got The Node As Temp Node Element " + temp.data);
    Node mid = obj.getMidNode(obj.head);
    System.out.println("Got The Node As Temp Node Element " + mid.data);
  }
}
