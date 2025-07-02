import java.util.*;
class MaxMinSumBrute1
{
public static List<List<Integer>>  maxSumSUb(int a[],int n,int m)
{
   List<List<Integer>>ans =new ArrayList<>();
   for(int i=0;i<=n-m;i++)
   {
    TreeMap<Integer,Integer>tm=new TreeMap<>(Collections.reverseOrder());
    for(int j=i;j<i+m;j++)
    {
        tm.put(a[j],j);
    }
    List<Integer>res=new ArrayList<>();
    res.add(tm.firstKey());
    res.add(tm.lastKey());
    ans.add(res);
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
        System.out.print(maxSumSUb(a,n,v));
}
}