class LinkedList{
    public static void main(String[] args)
    {
    LinkedList list=new LinkedList();
    Node<Integer> head=new Node<>(10);
    Node<Integer> second=new Node<>(20);
    head.next=second;
    Node third=new Node(30);
    second.next=third;
    Node fourth=new Node(40);
    third.next=fourth;
    list.traverse(head);
    }
    public void traverse(Node head){
       if(head==null){
           return;
       }
       System.out.println(head.data);
       traverse(head.next);
    }
}