import java.util.*;

class MinSumSubarrayMem {
    public static int minSubarraySum(int arr[], int n, int index, int prevSum, int minSum) {
        if (index == n) return minSum;

        int currSum = Math.min(arr[index], prevSum + arr[index]);
        minSum = Math.min(minSum, currSum);

        return minSubarraySum(arr, n, index + 1, currSum, minSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(minSubarraySum(arr, n, 0, 0, Integer.MAX_VALUE));
        sc.close();
    }
}
