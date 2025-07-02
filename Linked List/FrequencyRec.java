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
public class FrequencyRec
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
        if(curr==null) return 0;
        else if(curr.data==x)
        return 1+frequency(curr.next, x);
        else
        return frequency(curr.next, x);
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
