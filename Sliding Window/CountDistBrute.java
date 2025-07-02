
import java.util.*;

class CountDistBrute {
    public static List<Integer> countDist(int a[], int n, int k) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<=n-k;i++)
        {
            HashSet<Integer>hs=new HashSet<>();
            for(int j=i;j<i+k;j++)
            hs.add(a[j]);
            ans.add(hs.size());
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

        List<Integer> ans = countDist(a, n, v);
        for (Integer x : ans)
            System.out.print(x + " ");
    }
}
