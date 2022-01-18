class Reverse
{
  public static void main(String[] args)
  {
  Node<String>a=new Node<>("Vishal");
  Node<String>b=new Node<>("Vitthal");
  a.next=b;
  Node<String>c=new Node<>("Sadashiv");
  b.next=c;
  Node<String>d=new Node<>("Chand");
  c.next=d;
  Node<String> head=reverse(a);
traverse(head);
  }
    public  static void traverse(Node<String> head){
        Node<String> Current=head;
       if(Current==null){
           return;
       }
       System.out.println(head.data);
       traverse(head.next);
    }
  
  public static Node<String> reverse(Node<String> head ){
    Node<String> prev=null;
    Node<String>current=head;
    while(current!=null)
    {
        Node<String> next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    return prev;
  }
}