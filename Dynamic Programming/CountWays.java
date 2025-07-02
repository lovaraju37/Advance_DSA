
import java.util.*;
class CountWays
{
public static int countWays(int n)
{
    int f[]=new int[n];
    f[0]=1;f[1]=2;
    for(int i=2;i<n;i++)
    f[i]=f[i-1]+f[i-2];
    return f[n-1];
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println(countWays(n));
}
}