import java.util.*;
class MaxSumBrute5
{
public static List<Integer>  maxSumSUb(int a[],int n,int m)
{
   List<Integer>ans =new ArrayList<>();
   for(int i=0;i<=n-m;i++)
   {
    TreeMap<Integer,Integer>tm=new TreeMap<>(Collections.reverseOrder());
    for(int j=i;j<i+m;j++)
    {
        tm.put(a[j],j);
    }
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