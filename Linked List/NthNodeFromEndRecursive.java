import java.util.*;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NthNodeFromEndRecursive {
    static Node head = null;

    public static void insertFirst(int x) {
        Node p = new Node(x);
        if (head == null)
            head = p;
        else {
            p.next = head;
            head = p;
        }
    }

    public static void traverse() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static int getNthFromEndRecursive(Node curr, int n, int[] count) {
        if (curr == null) return -1;

        int result = getNthFromEndRecursive(curr.next, n, count);
        count[0]++;

        if (count[0] == n)
            return curr.data;

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements (-1 for exit):");
        int x = sc.nextInt();

        while (x != -1) {
            insertFirst(x);
            x = sc.nextInt();
        }

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] count = {0};
        System.out.println("Nth node from end: " + getNthFromEndRecursive(head, n, count));
        System.out.println("Elements in the linked list:");
        traverse();
    }
}
