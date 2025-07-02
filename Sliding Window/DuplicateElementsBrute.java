
import java.util.*;

class DuplicateElementsBrute {
    public static boolean hasDuplicateInSubarray(int[] a, int n, int k) {
        for(int i=0;i<=n-k;i++)
        {
            HashSet<Integer> hs =new HashSet<>();
            for(int j=i;j<i+k;j++)
            {
                if(hs.contains(a[j]))
                return true;
                hs.add(a[j]);
            }
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
