import java.util.*;

class MaxLengthBrute {
    public static int maxLength(int a[], int n, int x) {
        int ans = 0; 
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = i; j < n; j++) {
                s += a[j];
                if (s == x) {
                    ans = Math.max(ans, j - i + 1); 
                }
            }
        }
        return ans;
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

        System.out.print(maxLength(a, n, v));
    }
}
