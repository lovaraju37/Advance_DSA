import java.util.*;
class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class NthElemenIt
{
    static Node head=null;
    public static Node insertFirst(int x){
        Node p=new Node(x);
        if(head==null)
        head=p;
        else{
            p.next=head;
            head=p;
        }
        return head;
    }
    public static void traverse(Node head)
    {
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+"-->");
        curr=curr.next;
        }
        System.out.println();

    }
    public static int nTh(Node curr,int n)
    {
       int c=count(curr);
       int pos=c-n+1;
       for(int i=1;i<pos;i++)
       {
            curr=curr.next;
       }
       if(curr==null)
       return -1;
       return curr.data;
    }
    public static int count(Node curr)
    {
        int c=0;
        while(curr!=null)
        {
            c++;
            curr=curr.next;
        }
        return c;
    }
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements:(-1 for exit)");
        int x=sc.nextInt();
        while(x!=-1){
           
            head=insertFirst(x);
            x=sc.nextInt();
        }
        System.out.print("Enter n:");
        int n=sc.nextInt();
        Node curr=head;
        System.out.println(nTh(curr,n));
        System.out.println("Elements in the linked list:");
        traverse(head);

    }
}
