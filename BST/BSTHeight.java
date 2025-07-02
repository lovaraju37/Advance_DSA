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

public class BSTHeight {
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

    public static int height(BSTNode root) {
        if (root == null) 
            return 0;
        else
            return 1 + Math.max(height(root.left), height(root.right));
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

        System.out.println("Height/Depth of the BST: "+height(root));
    }
}