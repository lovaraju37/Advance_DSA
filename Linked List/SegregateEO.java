import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SegregateEO {
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

    public static void traverse(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static Node segregate(Node head) {
        if (head == null) return null;

        Node evenStart = null, evenEnd = null, oddStart = null, oddEnd = null;
        Node curr = head;

        while (curr != null) {
            int val = curr.data;
            if (val % 2 == 0) {
                if (evenStart == null) {
                    evenStart = evenEnd = curr;
                } else {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            } else { 
                if (oddStart == null) {
                    oddStart = oddEnd = curr;
                } else {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }
            curr = curr.next;
        }
        if (evenStart == null) return oddStart;
        if (oddStart == null) return evenStart;

        evenEnd.next = oddStart;
        oddEnd.next = null;

        return evenStart;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements (-1 to exit):");
        int x = sc.nextInt();

        while (x != -1) {
            head = insertFirst(x);
            x = sc.nextInt();
        }

        System.out.println("Original List:");
        traverse(head);

        head = segregate(head);

        System.out.println("Segregated List (Even followed by Odd):");
        traverse(head);
    }
}
