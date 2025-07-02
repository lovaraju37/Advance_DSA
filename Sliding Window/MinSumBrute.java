
import java.util.*;
class MinSumBrute
{
public static int minSumSub(int a[],int n,int m)
{
    int maxS=Integer.MAX_VALUE;
    int sum=0;
    for(int i=0;i<=n-m;i++)
    {
     int s=0;
     for(int j=i;j<i+m;j++)
     {
         s+=a[j];
     }
     if(s<maxS){
     maxS=s;
     sum+=s;
     }
     }
     return sum;
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
        System.out.println(minSumSub(a,n,v));
}
}