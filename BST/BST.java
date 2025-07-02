import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}

class BST {
    Node root;

    Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    void reverseLevelOrder(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            stack.push(curr.data);
            if (curr.right != null) queue.add(curr.right);
            if (curr.left != null) queue.add(curr.left);
        }
        while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) tree.root = tree.insert(tree.root, sc.nextInt());
        tree.reverseLevelOrder(tree.root);
        sc.close();
    }
}
