import java.util.*;

class MaxSumSubarrayMem2 {
    public static int[] maxSubarraySum(int arr[], int n, int index, int prevSum, int maxSum, int start, int end, int tempStart) {
        if (index == n) return Arrays.copyOfRange(arr, start, end + 1);

        int currSum = Math.max(arr[index], prevSum + arr[index]);

        if (arr[index] > prevSum + arr[index]) tempStart = index;
        if (currSum > maxSum) {
            maxSum = currSum;
            start = tempStart;
            end = index;
        }

        return maxSubarraySum(arr, n, index + 1, currSum, maxSum, start, end, tempStart);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] subarray = maxSubarraySum(arr, n, 0, 0, Integer.MIN_VALUE, 0, 0, 0);
        for (int num : subarray) System.out.print(num + " ");
        sc.close();
    }
}
