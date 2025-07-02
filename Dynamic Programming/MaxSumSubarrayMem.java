import java.util.*;

class MaxSumSubarrayMem {
    public static int maxSubarraySum(int arr[], int n, int index, int prevSum, int maxSum) {
        if (index == n) return maxSum;

        int currSum = Math.max(arr[index], prevSum + arr[index]);
        maxSum = Math.max(maxSum, currSum);

        return maxSubarraySum(arr, n, index + 1, currSum, maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(maxSubarraySum(arr, n, 0, 0, Integer.MIN_VALUE));
        sc.close();
    }
}
