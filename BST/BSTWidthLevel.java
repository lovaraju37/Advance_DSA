import java.util.*;

class BSTWidthLevel {
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int data) { this.data = data; left = right = null; }
    }

    static TreeNode insert(TreeNode root, int key) {
        if (root == null) return new TreeNode(key);
        if (key < root.data) root.left = insert(root.left, key);
        else root.right = insert(root.right, key);
        return root;
    }

    static int getWidth(TreeNode root, int level) {
        if (root == null) return 0;
        if (level == 1) return 1;
        return getWidth(root.left, level - 1) + getWidth(root.right, level - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter node values:");
        while (n-- > 0) root = insert(root, sc.nextInt());
        System.out.println("Enter level number:");
        int level = sc.nextInt();
        System.out.println("Width of level " + level + " is: " + getWidth(root, level));
    }
}
