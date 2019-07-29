package linkList;
import linkList.InsertInLinkList;
import java.util.*;
public class NodeIntersect extends InsertInLinkList{
  // public Node nodeIntersectS(Node head1,Node head2){
  //   Node n1 = head1;
  //   Node n2 = head2;
  //   Node n3 = (new NodeIntersect()).head;
  //   int count = 1;
  //   while(n1!= null && n2 != null){
  //     if(n2.data == n1.data){
  //       if(count == 1){
  //         n3 = new Node(n1.data);
  //       }
  //       else{
  //       append(n3,n1.data);
  //     }
  //     count ++;
  //     }
  //     if(getLength(n1)<=getLength(n2)){
  //       n1 = n1.next;
  //     }
  //       if(getLength(n2)<=getLength(n1)){
  //       n2 = n2.next;
  //     }
  //   }
  //
  //   return n3;
  // }
  public Node nodeIntersectUS(Node head1,Node head2){
    Node n3 = (new NodeIntersect()).head;
    Node n1 = head1;
    Node n2 = head2;
    int count = 1;
    HashSet<Integer> store = new HashSet<Integer>();
    while(n1!=null){
      n2 = head2 ;
      while(n2!=null){
        if(!store.contains(n2.data)){
        if(n1.data==n2.data){
          store.add(n2.data);
          if(count == 1){
            n3 = new Node(n1.data);
          }
          else{
          append(n3,n1.data);
        }
        count++;
        }
        }
        n2 = n2.next;
      }
      n1 = n1.next;
    }
    return n3;
  }
  public int getLength(Node head){
    Node n = head;
    int count = 0;
    while(n.next!=null){
      count++;
      n = n.next;
    }
    return count +1 ;
  }
  public static void main(String[] args) {
    NodeIntersect obj = new NodeIntersect();
    obj.head = new Node(4);
    obj.append(obj.head,3);
    obj.append(obj.head,2);
    obj.append(obj.head,1);
    obj.append(obj.head,0);
    NodeIntersect obj1 = new NodeIntersect();
    obj1.head = new Node(4);
    obj1.append(obj1.head,3);
    obj1.append(obj1.head,0);
    obj1.append(obj1.head,0);
    obj1.append(obj1.head,0);
    Node n = obj.nodeIntersectUS(obj.head,obj1.head);
    obj.traverse(n);

  }
}
