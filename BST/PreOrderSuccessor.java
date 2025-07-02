import java.util.*;

class BSTNode {
    int data;
    BSTNode left, right;

    public BSTNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class PreOrderSuccessor {
    static BSTNode root = null;

    public static BSTNode insert(BSTNode root, int x) {
        if (root == null) return new BSTNode(x);
        if (x < root.data) root.left = insert(root.left, x);
        else if (x > root.data) root.right = insert(root.right, x);
        return root;
    }

    public static void preorder(BSTNode root, List<Integer> ls) {
        if (root != null) {
            ls.add(root.data);
            preorder(root.left, ls);
            preorder(root.right, ls);
        }
    }

    public static BSTNode findSuccessor(BSTNode root, int x) {
        List<Integer> ls = new ArrayList<>();
        preorder(root, ls);

        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i) == x) {
                if (i + 1 < ls.size()) {
                    return new BSTNode(ls.get(i + 1)); // return next node
                } else {
                    return null;
                }
            }
        }
        return null; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: (-1 for exit)");
        int x = sc.nextInt();
        while (x != -1) {
            root = insert(root, x);
            x = sc.nextInt();
        }

        System.out.print("Enter node to find preorder successor: ");
        int key = sc.nextInt();
        BSTNode result = findSuccessor(root, key);
        System.out.println(result != null ? "Preorder Successor: " + result.data : "No Successor Found");
        sc.close();
    }
}
