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

public class BstDelete {
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

    public static void inorder(BSTNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static BSTNode delete(BSTNode root, int x) {
        BSTNode curr = root;
        BSTNode par = null;

        while (curr != null && curr.data != x) {
            par = curr;
            if (x < curr.data)
                curr = curr.left;
            else
                curr = curr.right;
        }

        if (curr == null) 
            return root; // Element not found

        // Case 1: No child (leaf node)
        if (curr.left == null && curr.right == null) {
            if (par == null)
                return null; // Only one node in tree
            if (par.left == curr)
                par.left = null;
            else
                par.right = null;
        }
        // Case 2: Two children
        else if (curr.left != null && curr.right != null) {
            BSTNode p = curr;
            BSTNode q = curr.right;

            while (q.left != null) {
                p = q;
                q = q.left;
            }

            curr.data = q.data; // Copy inorder successor's data

            if (p.left == q) // Removing successor node
                p.left = q.right;
            else
                p.right = q.right;
        }
        // Case 3: One child
        else {
            BSTNode child = (curr.left != null) ? curr.left : curr.right;

            if (par == null) // If deleting the root node
                return child;

            if (par.left == curr)
                par.left = child;
            else
                par.right = child;
        }
        return root;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:(-1 for exit)");
        int x = sc.nextInt();
        while (x != -1) {
            root = insert(root, x);
            x = sc.nextInt();
        }
        System.out.print("Enter element to delete:");
        int a = sc.nextInt();
        System.out.println("Before Deletion elements:");
        inorder(root);
        root = delete(root, a);
        System.out.println("\nAfter Deletion elements:");
        inorder(root);
        sc.close();
    }
}
