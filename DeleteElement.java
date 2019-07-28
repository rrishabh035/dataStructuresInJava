package linkList ;
import linkList.InsertInLinkList;
public class DeleteElement extends InsertInLinkList{
  public Node DeleteAKey(Node head,int key){
    Node n = head;
    while(n.next!=null){
      if (n.next.data == key) {
        n.next = n.next.next;
        break;
      }
      n = n.next;
    }
    return head;
  }
  public Node DeleteAPosition(Node head,int position){
    Node n = head;
    int count = 2;
      while(n.next!=null){
        if (count == position) {
          n.next = n.next.next;
          break;
        }
        if(position == 1){
          head = head.next;
          break;
        }
        count ++ ;
        n = n.next;
      }
      return head;
  }
  public static void main(String[] args) {
    DeleteElement delete = new DeleteElement();
    delete.head = new Node(5);
    delete.head = delete.insertHead(delete.head,5);
    delete.traverse(delete.head);
    delete.append(delete.head,50);
    delete.append(delete.head,30);
    delete.append(delete.head,70);
    delete.traverse(delete.head);
    delete.head = delete.DeleteAKey(delete.head,70);
    delete.head = delete.DeleteAPosition(delete.head,3);
    delete.traverse(delete.head);
  }

}
