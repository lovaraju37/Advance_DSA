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
public class SearchRec
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
    public static boolean search(Node curr,int x)
    {
        if(curr==null)
        return false;
        else if(curr.data==x)
        return true;
        else
        return search(curr.next,x);
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
        System.out.print("Enter element to search:");
        int x=sc.nextInt();
        Node curr=head;
        System.out.println(search(curr,x));
        System.out.println("Elements in the linked list:");
        traverse(head);

    }
}
