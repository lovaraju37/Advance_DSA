
import java.util.*;
class SlideDiffSum
{
public static int  maxSumSUb(int a[],int n,int m)
{
   int s1=0,s2=0,s3=0;
   TreeMap<Integer,Integer>tm=new TreeMap<>(Collections.reverseOrder());
   for(int i=0;i<m;i++)
   tm.put(a[i],i);
   s1=tm.firstKey();
   s2=tm.lastKey();
   s3+=s1-s2;
   for(int i=1;i<=n-m;i++)
   {
    List<Integer>rs1=new ArrayList<>();
    tm.put(a[i+m-1],i+m-1);
    tm.remove(a[i-1]);
    s1=tm.firstKey();
   s2=tm.lastKey();
   s3+=s1-s2;
   }
   return s3;

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