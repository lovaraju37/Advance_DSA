
import java.util.*;

class DuplicateElementsSlide {
    public static boolean hasDuplicateInSubarray(int[] arr, int n, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (window.contains(arr[i]))
                return true;

            window.add(arr[i]);

            if (i >= k - 1)
                window.remove(arr[i - k + 1]);
        }
        return false;
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

        System.out.println(hasDuplicateInSubarray(arr, n, k));
    }
}
