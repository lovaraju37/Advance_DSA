
import java.util.*;
class SlidingWindow2
{
public static List<List<Integer>>  maxSumSUb(int a[],int n,int m)
{
   List<List<Integer>>ans =new ArrayList<>();
   TreeMap<Integer,Integer>tm=new TreeMap<>(Collections.reverseOrder());
   for(int i=0;i<m;i++)
   tm.put(a[i],i);
   List<Integer>rs=new ArrayList<>();
   rs.add(tm.firstKey());
   rs.add(tm.lastKey());
   ans.add(rs);
   for(int i=1;i<=n-m;i++)
   {
    List<Integer>rs1=new ArrayList<>();
    tm.put(a[i+m-1],i+m-1);
    tm.remove(a[i-1]);
    rs1.add(tm.firstKey());
    rs1.add(tm.lastKey());
    ans.add(rs1);
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