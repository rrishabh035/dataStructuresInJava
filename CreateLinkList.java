public class CreateLinkList{
  Node head;

  public  int traverse(Node head){
    Node n = head;
    while(n!=null){
        System.out.println("Got The Data :" + n.data);
        n = n.next;
    }
    return 0;
  }

  static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
    }
}
    public static void main(String[] args) {
      CreateLinkList obj = new CreateLinkList();
      obj.head = new Node(2);
      Node second = new Node(3);
      Node third = new Node(4);
      obj.head.next = second;
      second.next = third;
      third.next = null;
      obj.traverse(obj.head);

    }
}
