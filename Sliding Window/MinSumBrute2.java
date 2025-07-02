
import java.util.*;
class MinSumBrute2
{
public static int[] minSumSUb(int a[],int n,int m)
{
    int maxS=Integer.MAX_VALUE,s=0,e=m-1;
    for(int i=0;i<=n-m;i++)
    {
     int s1=0;
     for(int j=i;j<i+m;j++)
     {
         s1+=a[j];
     }
     if(s1<maxS){
     maxS=s1;
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
        int ans[]=minSumSUb(a,n,v);
        for(int x:ans)
        System.out.print(x+" ");
}
}