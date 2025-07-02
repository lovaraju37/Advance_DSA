import java.util.*;

class FirstNegativeSlide {
    public static List<Integer> firstNegative(int a[], int n, int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() == i - k)
                dq.pollFirst();
            
            if (a[i] < 0)
                dq.offerLast(i);
            
            if (i >= k - 1) {
                if (!dq.isEmpty())
                    ans.add(a[dq.peekFirst()]);
                else
                    ans.add(0);
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

        System.out.print("Enter k: ");
        int v = sc.nextInt();
        sc.close();

        List<Integer> ans = firstNegative(a, n, v);
        for (Integer x : ans)
            System.out.print(x + " ");
    }
}
