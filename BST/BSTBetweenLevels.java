import java.util.*;

class BSTZigZag {
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

    static void zigzagTraversal(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelNodes = new ArrayList<>();
            while (size-- > 0) {
                TreeNode temp = queue.poll();
                levelNodes.add(temp.data);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            if (!leftToRight) Collections.reverse(levelNodes);
            for (int num : levelNodes) System.out.print(num + " ");
            leftToRight = !leftToRight;
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
