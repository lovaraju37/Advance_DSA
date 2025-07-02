import java.util.*;

class BSTLevelOfX {
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

    static int getLevel(TreeNode root, int x, int level) {
        if (root == null) return -1;
        if (root.data == x) return level;
        int left = getLevel(root.left, x, level + 1);
        return (left != -1) ? left : getLevel(root.right, x, level + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;
        int n = sc.nextInt();
        while (n-- > 0) root = insert(root, sc.nextInt());
        int x = sc.nextInt();
        System.out.println(getLevel(root, x, 1));
    }
}
