import java.util.*;

class BinaryTree {
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int data) { this.data = data; left = right = null; }
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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;
        int n = sc.nextInt();
        while (n-- > 0) root = insert(root, sc.nextInt());
        zigzagTraversal(root);
    }
}
