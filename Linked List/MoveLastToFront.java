
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
public class MoveLastToFront
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
    public static int findMiddle(Node head)
    {
        Node curr=head;
        int c=0;
        while(curr!=null)
        {
            c++;
            curr=curr.next;
        }
        int mid;
        if(c%2==0)
        mid=c/2+1;
        else
        mid=c/2;
        curr=head;
        for(int i=0;i<mid;i++)
        curr=curr.next;
        return curr.data;

    }
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of elements in the linked list:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            head=insertFirst(x);
        }
        
        System.out.println("Middle Element is: "+findMiddle(head));
        System.out.println("Elements in the linked list:");
        traverse(head);

    }
}
