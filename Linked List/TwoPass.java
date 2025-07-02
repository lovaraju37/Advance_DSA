
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
public class TwoPass
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
    public static int middle(Node head)
    {
        Node curr = head;
        int c=0;
        while(curr!=null)
        {
            c++;
            curr=curr.next;
        }
        curr=head;
        int mid=0;
        if(c%2==0)
        mid=c/2+1;
        else
        mid=c/2;
        for(int i=0;i<mid;i++)
        {
            curr=curr.next;
        }
        return curr.data;

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
        System.out.println("Middle element: "+middle(head));
        System.out.println("Elements in LL:");
        traverse(head);

    }
}
