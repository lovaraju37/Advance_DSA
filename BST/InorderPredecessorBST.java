import java.util.*;

class BSTNode {
    int data;
    BSTNode left, right;

    public BSTNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class InorderPredecessorBST {
    static BSTNode root = null;

    public static BSTNode insert(BSTNode root, int x) {
        if (root == null) return new BSTNode(x);
        if (x < root.data) root.left = insert(root.left, x);
        else if (x > root.data) root.right = insert(root.right, x);
        return root;
    }

    public static BSTNode findPredecessor(BSTNode root, int x) {
        BSTNode predecessor = null, curr = root;

        while (curr != null) {
            if (x > curr.data) {
                predecessor = curr; 
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        return predecessor;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: (-1 for exit)");
        int x = sc.nextInt();
        while (x != -1) {
            root = insert(root, x);
            x = sc.nextInt();
        }

        System.out.print("Enter node to find inorder predecessor: ");
        int key = sc.nextInt();
        BSTNode result = findPredecessor(root, key);
        System.out.println(result != null ? "Inorder Predecessor: " + result.data : "No Predecessor Found");
        sc.close();
    }
}
