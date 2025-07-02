
import java.util.*;
class SumX
{
public static int sumX(int a[],int n,int x)
{
   HashMap<Integer,Integer>hm=new HashMap<>();
   int wsum=0,res=0;
   hm.put(0, 1); 
   for (int i = 0; i < n; i++) {
       wsum += a[i];

       if(hm.containsKey(wsum-x)) 
           res+=hm.get(wsum-x);
       hm.put(wsum,hm.getOrDefault(wsum, 0) + 1);
   }
   return res;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter x:");
        int v=sc.nextInt();
        System.out.print(sumX(a, n, v));
}
}