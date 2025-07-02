import java.util.*;

class MaxSumSubarrayTab2 {
    public static int[] maxSubarraySum(int arr[], int n) {
        int maxSum = arr[0], currSum = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > currSum + arr[i]) {
                currSum = arr[i];
                tempStart = i;
            } else {
                currSum += arr[i];
            }

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] subarray = maxSubarraySum(arr, n);
        for (int num : subarray) System.out.print(num + " ");
        sc.close();
    }
}
