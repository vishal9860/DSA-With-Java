class LinkedList{
    public static void main(String[] args)
    {
    LinkedList list=new LinkedList();
    Node<Integer> head=new Node<>(10);
    Node<Integer> second=new Node<>(20);
    head.next=second;
    Node<Integer> third=new Node<>(30);
    second.next=third;
    Node<Integer>fourth=new Node<>(40);
    third.next=fourth;
    list.traverse(head);
    }


    public void traverse(Node<Integer> head){
        Node<Integer> Current=head;
       if(Current==null){
           return;
       }
       increment(Current);
       System.out.println(head.data);
       traverse(head.next);
    }

    public static void increment(Node<Integer> head)
    {
        head.data++;
    }

}