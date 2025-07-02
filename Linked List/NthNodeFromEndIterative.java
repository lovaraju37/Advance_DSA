import java.util.*;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NthNodeFromEndIterative {
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

    public static int getNthFromEndIterative(int n) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if (n > count) return -1;

        temp = head;
        for (int i = 1; i < count - n + 1; i++) {
            temp = temp.next;
        }
        return temp.data;
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

        System.out.println("Nth node from end: " + getNthFromEndIterative(n));
        System.out.println("Elements in the linked list:");
        traverse();
    }
}
