import java.util.*;

class MinSumSubarrayTab2 {
    public static int[] minSubarraySum(int arr[], int n) {
        int minSum = arr[0], currSum = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < currSum + arr[i]) {
                currSum = arr[i];
                tempStart = i;
            } else {
                currSum += arr[i];
            }

            if (currSum < minSum) {
                minSum = currSum;
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

        int[] subarray = minSubarraySum(arr, n);
        for (int num : subarray) System.out.print(num + " ");
        sc.close();
    }
}
