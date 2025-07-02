
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
public class ModifiedOnePass
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
        Node mid=head;
        Node curr=head;
        int c=0;
        while(curr!=null)
        {
            if(c%2==1)
            mid=mid.next;
            c++;
            curr=curr.next;
        }
        return mid.data;
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
