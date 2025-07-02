
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
public class ReverseArray
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
    public static Node reverse(Node head)
    {
        ArrayList<Node> ar=new ArrayList<>();
        Node curr=head;
        while(curr!=null)
        {
            ar.add(curr);
            curr=curr.next;
        }
        head=ar.getLast();
        curr=head;
        for(int i=ar.size()-2;i>=0;i--)
        {
            curr.next=ar.get(i);
            curr=curr.next;
        }
        curr.next=null;
        return head;
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
        System.out.println("Elements in the linked list(Before):");
        traverse(head);

        head=reverse(head);
        System.out.println("Elements in the linked list(After):");
        traverse(head);

    }
}
