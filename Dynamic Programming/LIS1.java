import java.util.*;

class LIS1 {
    public static int lis(int[] a, int m) {
        int[] dp = new int[m];
        Arrays.fill(dp, 1); 
        int max = 1; 

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && dp[i] < dp[j] + 1) { 
                    dp[i] = dp[j] + 1; 
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Length of LIS: " + lis(a, m));
        sc.close();
    }
}
