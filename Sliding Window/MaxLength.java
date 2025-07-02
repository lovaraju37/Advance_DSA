
import java.util.*;
class MaxLength
{
public static int maxLength(int a[],int n,int x)
{
   HashMap<Integer,Integer>hm=new HashMap<>();
   int wsum=0,res=0;
   for(int i=0;i<n;i++)
   {
    wsum=wsum+a[i];
    if(wsum==x)
    res=i+1;
    if(hm.containsKey(wsum-x))
    res=Math.max(res,i-hm.get(wsum-x));
    if(!hm.containsKey(wsum))
    hm.put(wsum,i);
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
        System.out.print(maxLength(a, n, v));
}
}