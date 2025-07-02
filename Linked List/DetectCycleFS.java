import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectCycleFS {
    static Node head = null;

    public static Node insertFirst(int x) {
        Node p = new Node(x);
        if (head == null)
            head = p;
        else {
            p.next = head;
            head = p;
        }
        return head;
    }

    public static boolean detect(Node head) {
       Node fp=head,sp=head;
       while(sp!=null&&fp!=null&&fp.next!=null)
       {
        sp=sp.next;
        fp=fp.next;
        if(sp==fp)
        return true;
       }
       return false;
    }

    public static void createCycle(int pos) {
        if (head == null || pos < 0) return;

        Node temp = head, cycleNode = null;
        int count = 0;

        while (temp.next != null) {
            if (count == pos) {
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }

        if (cycleNode != null) {
            temp.next = cycleNode; 
            System.out.println("Cycle created at position " + pos);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:(-1 for exit)");
        int x = sc.nextInt();
        while (x != -1) {
            head = insertFirst(x);
            x = sc.nextInt();
        }

        System.out.println("Enter position to create a cycle (-1 for no cycle): ");
        int pos = sc.nextInt();

        if (pos != -1) {
            createCycle(pos);
        }

        System.out.println("Linked list has cycle: " + detect(head));
    }
}
