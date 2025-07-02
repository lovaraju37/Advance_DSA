
import java.util.*;

class CountDistSlide {
    public static List<Integer> countDist(int a[], int n, int k) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++)
        hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        ans.add(hm.size());
        for(int i=1;i<=n-k;i++)
        {
            hm.put(a[i+k-1],hm.getOrDefault(a[i+k-1], 0)+  1);
            hm.put(a[i-1],hm.get(a[i-1])-1);
            if(hm.get(a[i-1])==0)
            hm.remove(a[i-1]);
            ans.add(hm.size());
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
