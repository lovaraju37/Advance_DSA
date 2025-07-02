import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class HeightWithoutRecursion {
    public int heightWithoutRecursion(Node root) {
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int height = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            height++;
        }
        return height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the nodes of the BST (space-separated, enter 'done' to finish):");
        String input;
        while (!(input = scanner.next()).equalsIgnoreCase("done")) {
            root = insert(root, Integer.parseInt(input));
        }
        HeightWithoutRecursion hwr = new HeightWithoutRecursion();
        System.out.println("Height of the tree: " + hwr.heightWithoutRecursion(root));
        scanner.close();
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
}