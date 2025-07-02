
import java.util.*;
class LCS1_num
{
public static int lcs(int[] a,int m,int[] b,int n)
{
    if(m==0||n==0) return 0;
    else if(a[m-1]==b[n-1])
    return 1+lcs(a, m-1, b, n-1);
    else
    return Math.max(lcs(a, m-1, b, n),lcs(a, m, b, n-1));
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter m:");
        int m=sc.nextInt();
        System.out.println("Enter Array 1 elements:");
        int a[]=new int[m];
        for(int i=0;i<m;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter Array 2 elements:");
        int b[]=new int[n];
        for(int i=0;i<m;i++)
        b[i]=sc.nextInt();
       System.out.println(lcs(a,m,b,n));
}
}