import java.util.*;

class TrieNode {
    TrieNode Children[];
    boolean isLeaf;
    int c;

    public TrieNode() {
        Children = new TrieNode[26];
        isLeaf = false;
        c = 0;
    }
}

public class PrefixListBrute {

    public static int search(TrieNode root, String x) {
        TrieNode curr = root;
        for (char ch : x.toCharArray()) {
            if (curr.Children[ch - 'a'] == null)
                return 0;
            curr = curr.Children[ch - 'a'];
        }
        return curr.c;
    }

    public static void insert(TrieNode root, String x) {
        TrieNode curr = root;
        for (char ch : x.toCharArray()) {
            if (curr.Children[ch - 'a'] == null) {
                curr.Children[ch - 'a'] = new TrieNode();
            }
            curr = curr.Children[ch - 'a'];
            curr.c += 1; 
        }
        curr.isLeaf = true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        TrieNode root = new TrieNode();
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            insert(root, word);
        }

        System.out.print("Enter the prefix to search: ");
        String x = sc.nextLine();
        System.out.println(search(root, x));
}
}