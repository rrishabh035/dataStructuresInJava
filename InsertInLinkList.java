public class InsertInLinkList{
  Node head ;

  public int traverse(Node head){
    Node n = head ;
    while(n != null){
      System.out.println("Got The Data :" + n.data);
      n = n.next;
    }
    return 0;
  }
  public Node insertAfterKey(Node head , int key , int data){
    Node n = head , temp;
    Node ofNewData = new Node(data);
    while(n!=null){
      if(n.data == key){
        temp = n.next;
        n.next = ofNewData;
        n.next.next = temp;
      }
      n = n.next;
    }
    return head;
  }
  public Node append(Node head , int data){
    Node n = head , temp;
    Node ofNewData = new Node(data);
    while(n.next!=null){
      n = n.next;
    }
    n.next = ofNewData ;
    n.next.next = null ;
    return head;
  }
  public Node insertBeforeKey(Node head , int key , int data){
    Node n = head , temp;
    Node ofNewData = new Node(data);
    try {
      while(n.next!=null){
        if(n.next.data == key){
          temp = n.next;
          n.next = ofNewData;
          n.next.next = temp;
        }
        n = n.next;
      }
    } catch(Exception e) {}

    return head;
  }
  public Node insertHead(Node head , int data){
    Node temp;
    Node ofNewData = new Node(data);
    temp = head;
    head = ofNewData;
    head.next = temp;
    return head;
  }

  static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
    }
  }


  public static void main(String[] args) {
    InsertInLinkList obj = new InsertInLinkList();
    obj.head = new Node(4);
    Node second = new Node(3);
    obj.head.next = second;
    second.next = null;
    obj.traverse(obj.head);
    obj.head = obj.insertAfterKey(obj.head,3,45);
    System.out.println("Data After AfterKey Insertion");
    obj.traverse(obj.head);
    obj.head = obj.insertAfterKey(obj.head,3,23);
    System.out.println("Data After AfterKey Insertion");
    obj.traverse(obj.head);
    obj.head = obj.insertBeforeKey(obj.head,3,26);
    System.out.println("Data After BeforeKey Insertion");
    obj.traverse(obj.head);
    obj.head = obj.insertHead(obj.head,29);
    System.out.println("Data After Head Insertion");
    obj.traverse(obj.head);
    obj.head = obj.append(obj.head,41);
    System.out.println("Data After Append Insertion");
    obj.traverse(obj.head);

  }
}
