
import java.util.*;

class SubarraySumSlide {
    public static List<Integer> subarraySums(int[] arr, int n, int k) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (i >= k - 1) {
                result.add(sum);
                sum -= arr[i - k + 1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        sc.close();

        List<Integer> result = subarraySums(arr, n, k);
        for (int sum : result)
            System.out.print(sum + " ");
    }
}
