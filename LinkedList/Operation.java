import java.util.Scanner;
class Operation
{
  public static void main(String[] args)
  {
  Node<Integer>head=createLinkedList(); 
//   AddLast(head,50);
//   DeleteAt(head, 2);
 Node<Integer>Head=newlist(head);
 if(isPalindrome(head, Head)){
     System.out.println("LinkedList is Palindrome");
 }
 else{
      System.out.println("LinkedList is Not Palindrome");
 }
  traverse(Head);
  }
  public static void traverse(Node<Integer> head){
        Node<Integer> Current=head;
       if(Current==null){
           return;
       }
       System.out.println(Current.data);
       traverse(Current.next);
    }
  public static Node<Integer> createLinkedList(){
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
    public static void AddLast(Node<Integer> head,int data)
    {
    Node<Integer>curr=head;
    while(curr.next!=null)
    {
         curr=curr.next;
    }
    Node<Integer>last=new Node<>(data);
    curr.next=last;

    }
     public static void DeleteAt(Node<Integer> head,int pos)
    {
       Node<Integer>curr=head;
       Node<Integer>prev=null;
       for(int i=0;i<pos;i++)
       {
        prev=curr;
        curr=curr.next;
       }
        prev.next=curr.next;
    }
    public static Node<Integer> newlist(Node<Integer>head)
    {
        Node<Integer>curr=head;
        Node<Integer>prev=null;
        while(curr!=null)
        {   
            Node<Integer>next=curr.next;
            Node<Integer>temp=new Node(curr.data);
            temp.next=prev;
            prev=temp;
            curr=next;
        }
        return prev;
    }
    public static boolean isPalindrome(Node<Integer> head1,Node<Integer> head2){
        Node<Integer>curr1=head1;
        Node<Integer>curr2=head2;
        while(curr1!=null){
            if(curr1.data!=curr2.data){
                return false;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return true;
    }
}