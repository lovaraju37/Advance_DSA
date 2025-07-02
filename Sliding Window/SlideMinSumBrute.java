
import java.util.*;
class SlideMinSumBrute
{
public static List<Integer>  maxSumSUb(int a[],int n,int m)
{
   int d1=0,d2=0;
   List<Integer>ans=new ArrayList<>();
   for(int i=0;i<=n-m;i++)
   {
    TreeMap<Integer,Integer>tm=new TreeMap<>(Collections.reverseOrder());
    for(int j=i;j<i+m;j++)
    {
        tm.put(a[j],j);
    }
    d1=tm.firstKey();
    d2=tm.lastKey();
    ans.add(d1-d2);
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