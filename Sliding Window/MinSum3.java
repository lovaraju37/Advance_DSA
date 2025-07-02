
import java.util.*;
class MinSum3
{
public static int[] minSumSUb(int a[],int n,int m)
{
   int wsum=0;
   int ans[]=new int[m];
   for(int i=0;i<m;i++){
   wsum+=a[i];
   ans[i]=a[i];
   }
   int mSum=wsum;
   for(int i=1;i<=n-m;i++)
   {
    wsum=wsum-a[i-1];
    wsum=wsum+a[i+m-1];
    if(wsum<mSum)
    {
        mSum=wsum;
        int k=0;
        for(int j=i;j<i+m;j++)
        {
            ans[k]=a[j];
            k++;
        }
    }
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
        int ans[]=minSumSUb(a,n,v);
        for(int x:ans)
        System.out.print(x+" ");
}
}