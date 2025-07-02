import java.util.*;

class BSTRightView {
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

    static void printRightView(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode lastNode = null;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                lastNode = temp;
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            System.out.print(lastNode.data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter node values:");
        while (n-- > 0) root = insert(root, sc.nextInt());
        System.out.println("Right view of the tree:");
        printRightView(root);
    }
}
