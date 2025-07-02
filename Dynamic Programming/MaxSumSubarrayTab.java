import java.util.*;

class MaxSumSubarrayTab {
    public static int maxSubarraySum(int arr[], int n) {
        int maxSum = arr[0], currSum = arr[0];

        for (int i = 1; i < n; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(maxSubarraySum(arr, n));
        sc.close();
    }
}
