
import java.util.*;

class Uniq_Tab {
    public static int unqPath(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++)
         dp[i][0] = 1; 
        for (int j = 0; j < n; j++) 
        dp[0][j] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] + dp[i - 1][j - 1];
            }
        }
        return dp[m - 1][n - 1]; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m, n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("Unique Paths (Right, Down & Diagonal): " + unqPath(m, n));

        sc.close();
    }
}
