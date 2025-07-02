
import java.util.*;

class UniqRec {
    public static int unqPath(int m, int n, int[][] dp) {
        if (m == 1 || n == 1) return 1;

        if (dp[m][n] != -1) return dp[m][n]; 

        return dp[m][n] = unqPath(m - 1, n, dp) + unqPath(m, n - 1, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m, n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp) Arrays.fill(row, -1); 

        System.out.println("Unique Paths: " + unqPath(m, n, dp));

        sc.close();
    }
}
