
import java.util.*;
class CountState2
{
public static int countState(int n)
{
    int f[]=new int[n+1];
    f[0]=0;f[1]=1;f[2]=2;f[3]=4;
    for(int i=4;i<=n;i++)
    f[i]=f[i-1]+f[i-2]+f[n-3];
    return f[n];
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println(countState(n));
}
}