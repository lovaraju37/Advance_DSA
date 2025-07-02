
import java.util.*;

class LIS_rec {
    public static int lis(int[] a, int i, int prev) {
        if (i == a.length) {
            return 0;
        }

        int exclude = lis(a,i + 1,prev);

        int include = 0;
        if (prev == -1 || a[i] > a[prev]) {
            include = 1 + lis(a, i + 1, i);
        }

        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.println("Enter Array elements:");
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Length of LIS (Recursive): " + lis(a, 0, -1));
        sc.close();
    }
}
