import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NthElementRec {
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
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static int count(Node curr) {
        if (curr == null) return 0;
        return 1 + count(curr.next);
    }

    public static int nTh(Node curr, int n) {
        int c = count(curr);
        int pos = c - n + 1;
        return findNth(curr, pos);
    }

    public static int findNth(Node curr, int pos) {
        if (curr == null) return -1;
        if (pos == 1) return curr.data;
        return findNth(curr.next, pos - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements (-1 for exit):");
        int x = sc.nextInt();

        while (x != -1) {
            head = insertFirst(x);
            x = sc.nextInt();
        }

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(nTh(head, n));
        System.out.println("Elements in the linked list:");
        traverse(head);
    }
}
