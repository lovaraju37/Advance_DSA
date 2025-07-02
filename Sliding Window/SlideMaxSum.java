
import java.util.*;
class SlideMaxSum
{
public static int  maxSumSUb(int a[],int n,int m)
{
   int sum=0;
  
   TreeMap<Integer,Integer>tm=new TreeMap<>(Collections.reverseOrder());
   for(int i=0;i<m;i++)
   tm.put(a[i],i);
   sum+=tm.firstKey();
   for(int i=1;i<=n-m;i++)
   {
    tm.put(a[i+m-1],i+m-1);
    tm.remove(a[i-1]);
    sum+=tm.firstKey();
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
        System.out.print(maxSumSUb(a,n,v));
}
}