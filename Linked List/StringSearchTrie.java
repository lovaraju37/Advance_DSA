import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    int count = 0;  
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
            node.count++; 
        }
    }

    public int countPrefix(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                return 0;
            }
            node = node.children.get(ch);
        }
        return node.count;
    }
}

public class StringSearchTrie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings in s: ");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("Enter strings for s:");
        Trie trie = new Trie();
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            trie.insert(s[i]); 
        }

        System.out.print("Enter number of strings in s1: ");
        int m = sc.nextInt();
        String[] s1 = new String[m];
        System.out.println("Enter strings for s1:");
        for (int i = 0; i < m; i++) {
            s1[i] = sc.next();
        }

        for (String query : s1) {
            int count = trie.countPrefix(query);
            System.out.println(query + " appears " + count + " times.");
        }

        sc.close();
    }
}
