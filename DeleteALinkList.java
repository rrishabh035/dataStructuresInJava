package linkList ;
import linkList.InsertInLinkList;
public class DeleteALinkList extends InsertInLinkList{
  public Node deleteLinkList(Node head){
    head = null;
    return head;
  }
  public static void main(String[] args) {
    DeleteALinkList obj = new DeleteALinkList();
    obj.head = new Node(10);
    obj.head = obj.insertHead(obj.head,7);
    obj.append(obj.head,40);
    obj.append(obj.head,50);
    obj.head  = obj.deleteLinkList(obj.head);
    obj.traverse(obj.head);
  }
}
