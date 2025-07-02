import java.util.*;

class MinSumSubarrayTab {
    public static int minSubarraySum(int arr[], int n) {
        int minSum = arr[0], currSum = arr[0];

        for (int i = 1; i < n; i++) {
            currSum = Math.min(arr[i], currSum + arr[i]);
            minSum = Math.min(minSum, currSum);
        }
        return minSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(minSubarraySum(arr, n));
        sc.close();
    }
}
