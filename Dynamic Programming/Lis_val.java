import java.util.*;

class Lis_val {
    public static List<Integer> lis(int[] a, int m) {
        int[] dp = new int[m]; 
        int[] prev = new int[m]; 

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLength = 1, lastIndex = 0;

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j; 
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                lastIndex = i;
            }
        }
        List<Integer> ls = new ArrayList<>();
        for (int i = lastIndex; i != -1; i = prev[i]) {
            ls.add(a[i]);
        }
        Collections.reverse(ls); 

        return ls;
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

        List<Integer> lisResult = lis(a, m);
        System.out.println("LIS Elements: " + lisResult);

        sc.close();
    }
}
