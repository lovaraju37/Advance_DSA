
import java.util.*;
class MaxSum5
{
public static List<Integer>  maxSumSUb(int a[],int n,int m)
{
   List<Integer>ans =new ArrayList<>();
   TreeMap<Integer,Integer>tm=new TreeMap<>(Collections.reverseOrder());
   for(int i=0;i<m;i++)
   tm.put(a[i],i);
   ans.add(tm.firstKey());
   for(int i=1;i<=n-m;i++)
   {
    tm.put(a[i+m-1],i+m-1);
    tm.remove(a[i-1]);
    ans.add(tm.firstKey());
   }
   return ans;

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter m:");
        int v=sc.nextInt();
        List<Integer> ans=maxSumSUb(a,n,v);
        for(Integer x:ans)
        System.out.print(x+" ");
}
}