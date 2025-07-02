import java.util.*;

class BSTLeftView {
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

    static void printLeftView(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.print(queue.peek().data + " ");
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
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
        System.out.println("Left view of the tree:");
        printLeftView(root);
    }
}
