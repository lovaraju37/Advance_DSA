import java.util.*;

class MinOp1 {
    public static int minOp(int n,int dp[]) {

        if (n == 1) return 0;

        if (dp[n] != -1) return dp[n];

        int ans1 = minOp(n - 1, dp); 
        int ans2 = (n % 2 == 0) ? minOp(n / 2, dp) : Integer.MAX_VALUE;
        int ans3 = (n % 3 == 0) ? minOp(n / 3, dp) : Integer.MAX_VALUE;

        return dp[n] = Math.min(ans1, Math.min(ans2, ans3)) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(minOp(n,dp));
        sc.close();
    }
}
