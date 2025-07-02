import java.util.*;

class MinSumSubarrayMem2 {
    public static int[] minSubarraySum(int arr[], int n, int index, int prevSum, int minSum, int start, int end, int tempStart) {
        if (index == n) return Arrays.copyOfRange(arr, start, end + 1);

        int currSum = Math.min(arr[index], prevSum + arr[index]);

        if (arr[index] < prevSum + arr[index]) tempStart = index;
        if (currSum < minSum) {
            minSum = currSum;
            start = tempStart;
            end = index;
        }

        return minSubarraySum(arr, n, index + 1, currSum, minSum, start, end, tempStart);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] subarray = minSubarraySum(arr, n, 0, 0, Integer.MAX_VALUE, 0, 0, 0);
        for (int num : subarray) System.out.print(num + " ");
        sc.close();
    }
}
