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
public class MenuLL
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
    public static Node insertLast(int x){
        Node p=new Node(x);
        if(head==null)
        head=p;
        else{
            Node curr=head;
            while(curr.next!=null)
            curr=curr.next;
            curr.next=p;
        }
        return head;
        
    }
    public static Node insertMiddle(int x,int pos){
        Node p=new Node(x);
        Node curr=head;
        for(int i=1;i<pos;i++)
            curr=curr.next;
        if(curr==null)
        return head;
        else{
            Node temp=curr.next;
            curr.next=p;
            p.next=temp;
        }
        return head;
        
    }
    public static Node deleteFirst()
    {
        if(head!=null)
            head=head.next;
        return head;
    }
    public static Node deleteLast()
    {
        if(head!=null)
        {
            Node curr=head;
            while(curr.next.next!=null)
            curr=curr.next;
            curr.next=null;
        }
        return head;
    }
    public static Node deleteMiddle(int pos)
    {
        Node curr=head;
        for(int i=1;i<pos-1;i++)
        curr=curr.next;
        curr.next=curr.next.next;
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
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Menu");
            System.out.println("____");
            System.out.println("1)Insertion");
            System.out.println("2)Deletion");
            System.out.println("3)Traverse");
            System.out.println("4)Exit");
            System.out.print("Enter your choice:");
            int ch=sc.nextInt();
            System.out.println();
        switch (ch) {
            case 1:
                System.out.println("Insertion:");
                System.out.print("Enter data:");
                int x=sc.nextInt();
                System.out.println("1)insert at first");
                System.out.println("2)insert at last");
                System.out.println("3)insert at middle");
                System.out.print("Enter your choice:");
                int ch2=sc.nextInt();
                System.out.println();

                if(ch2==1)
                head=insertFirst(x);
                else if(ch2==2)
                head=insertLast(x);
                else{
                    System.out.print("Enter position:");
                    int pos=sc.nextInt();
                    head=insertMiddle(x,pos);
                }
                break;
            case 2:
                System.out.println("Deletion:");
                System.out.println("1)delete at first");
                System.out.println("2)delete at last");
                System.out.println("3)delete at middle");
                System.out.println();
                System.out.print("Enter your choice:");
                int ch3=sc.nextInt();
                System.out.println();

                if(ch3==1)
                head=deleteFirst();
                else if(ch3==2)
                head=deleteLast();
                else{
                    System.out.print("Enter position:");
                    int pos=sc.nextInt();
                    head=deleteMiddle(pos);
                }
                break;
            case 3:
            System.out.println("Traverse:");
            traverse(head);
            
            System.out.println();
            break;
            case 4:
                break;
            default:
                break;
        }
    }
    }
}
