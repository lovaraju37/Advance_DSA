import java.util.*;

class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;

    public BSTNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class TraversalPostorder {
    static BSTNode root = null;

    public static BSTNode insert(BSTNode root, int x) {
        if (root == null) {
            return new BSTNode(x);
        }
        if (x < root.data)
            root.left = insert(root.left, x);
        else if (x > root.data)
            root.right = insert(root.right, x);
        
        return root;
    }

    public static void postorder(BSTNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:(-1 for exit)");
        int x = sc.nextInt();
        while (x != -1) {
            root = insert(root, x);
            x = sc.nextInt();
        }
        sc.close();

        System.out.println("Postorder Traversal:");
        postorder(root);
    }
}
