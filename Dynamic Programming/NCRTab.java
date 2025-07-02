
import java.util.*;

class NCRTab {
    public static int minSteps(int n) {
        int dp[] = new int[n + 1];
        dp[1] = 0; 

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; 

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); 
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Minimum steps to 1" + minSteps(n));
        sc.close();
    }
}
