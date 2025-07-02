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
public class FrequencyIt
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
    public static int frequency(Node curr,int x)
    {
        int c=0;
        while(curr!=null)
        {
            if(curr.data==x)
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
        Node curr=head;
        System.out.print("Enter element:");
        int x1=sc.nextInt();
        System.out.println(frequency(curr,x1));
        System.out.println("Elements in the linked list:");
        traverse(head);

    }
}
