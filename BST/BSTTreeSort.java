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

public class BSTTreeSort {
    static BSTNode root = null;
    static int index = 0;

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

    public static void inorderStore(BSTNode root, int a[]) {
        if (root != null) {
            inorderStore(root.left, a);
            a[index++] = root.data; 
            inorderStore(root.right, a);
        }
    }

    public static int[] sort(BSTNode root, int a[]) {
        index = 0; 
        inorderStore(root, a);
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            root = insert(root, arr[i]);
        }
        sc.close();

        arr = sort(root, arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
