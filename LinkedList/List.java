import java.util.Scanner;
class List{

    public static void main(String[] args)
    {
     List list=new List();
     Node<Integer> head=list.createLinkedList();
     traverse(head);
     int len=list.Length(head);
     System.out.println("The Length of The LinkedList is"+len);
     System.out.println(printithnode(head,2));
    }
    public Node<Integer> createLinkedList(){
        Scanner sc=new Scanner(System.in);
        Node<Integer>move=new Node<>(0);
        Node<Integer>head=move;
        while(true)
        {
            System.out.println("Enter The data");
            int datas=sc.nextInt();
            if(datas==-1)
            {
                break;
            }
            Node<Integer>temp=new Node<>(datas);
            move.next=temp;
            move=temp;
        }
        sc.close();
        return head.next;
    }
    public static void traverse(Node<Integer> head){
        Node<Integer> Current=head;
       if(Current==null){
           return;
       }
       System.out.println(Current.data);
       traverse(Current.next);
    }

    public  int Length(Node<Integer>head){
      int i=0;
      Node<Integer>curr=head;
      while(curr!=null)
      {
          curr=curr.next;
          i++;
      }
      return i;
    }

    public  static int printithnode(Node<Integer>head,int index){
        Node<Integer>curr=head;
       if(index==0)
       {
           return curr.data;
       }
    for(int i=0;i<index;i++){
        curr=curr.next;
    }
    return curr.data;
    }
}