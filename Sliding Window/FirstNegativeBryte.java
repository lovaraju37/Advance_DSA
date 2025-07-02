
import java.util.*;
class FirstNegativeBryte
{
public static List<Integer> firstNegative(int a[],int n,int k)
{
    List<Integer> ans=new ArrayList<>();
   for(int i=0;i<=n-k;i++)
   {
    int num=0;
    for(int j=i;j<i+k;j++)
    {
        if(a[j]<0&&num==0)
        num=a[j];
    }
    ans.add(num);
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
        System.out.print("Enter k:");
        int v=sc.nextInt();
        List<Integer> ans=firstNegative(a, n, v);
        for(Integer x:ans)
        System.out.print(x+" ");
}
}