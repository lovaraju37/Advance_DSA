
import java.util.*;

class SumXBrute {
    public static int sumX(int a[], int n, int x) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum == x)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter x: ");
        int v = sc.nextInt();
        sc.close();

        System.out.print(sumX(a, n, v));
    }
}
