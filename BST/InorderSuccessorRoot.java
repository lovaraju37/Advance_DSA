import java.util.*;

class BSTNode {
    int data;
    BSTNode left, right;

    public BSTNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class InorderSuccessorRoot {
    static BSTNode root = null;

    public static BSTNode insert(BSTNode root, int x) {
        if (root == null) return new BSTNode(x);
        if (x < root.data) root.left = insert(root.left, x);
        else if (x > root.data) root.right = insert(root.right, x);
        return root;
    }

    public static BSTNode findSuccessor(BSTNode root) {
        if (root == null || root.right == null) return null;
        BSTNode curr = root.right;
        while (curr.left != null) curr = curr.left;
        return curr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:(-1 for exit)");
        int x = sc.nextInt();
        while (x != -1) {
            root = insert(root, x);
            x = sc.nextInt();
        }
        BSTNode result = findSuccessor(root);
        System.out.println(result != null ? "Inorder Successor of Root: " + result.data : "No Successor Found");
        sc.close();
    }
}
