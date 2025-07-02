import java.util.*;

public class StringSearchBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings in s: ");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("Enter strings for s:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        System.out.print("Enter number of strings in s1: ");
        int m = sc.nextInt();
        String[] s1 = new String[m];
        System.out.println("Enter strings for s1:");
        for (int i = 0; i < m; i++) {
            s1[i] = sc.next();
        }
        for (String query : s1) {
            int count = 0;
            for (String str : s) {
                if (str.equals(query) || str.startsWith(query)) {
                    count++;
                }
            }
            System.out.println(query + " appears " + count + " times.");
        }

        sc.close();
    }
}
