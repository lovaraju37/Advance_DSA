
import java.util.*;
class MaxSum3
{
public static int[] maxSumSUb(int a[],int n,int m)
{
   int wsum=0;
   for(int i=0;i<m;i++)
   wsum+=a[i];
    int s=0,e=m-1;
   int mSum=wsum;
   for(int i=1;i<=n-m;i++)
   {
    wsum=wsum-a[i-1];
    wsum=wsum+a[i+m-1];
    if(wsum>mSum)
    {
        mSum=wsum;
        s=i;
        e=i+m-1;
    }
   }
   return new int[]{s,e};

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
        int ans[]=maxSumSUb(a,n,v);
        for(int x:ans)
        System.out.print(x+" ");
}
}