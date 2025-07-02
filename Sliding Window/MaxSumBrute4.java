import java.util.*;
class MaxSumBrute4
{
public static int[] maxSumSUb(int a[],int n,int m)
{
   int maxS=Integer.MIN_VALUE;
   int ans[]=new int[m];
   for(int i=0;i<=n-m;i++)
   {
    int s1=0;
    for(int j=i;j<i+m;j++)
    {
        s1+=a[j];
    }
    if(s1>=maxS){
        maxS=s1;
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
        int ans[]=maxSumSUb(a,n,v);
        for(int x:ans)
        System.out.print(x+" ");
}
}