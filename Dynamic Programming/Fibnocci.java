
import java.util.*;
class Fibnocci
{
public static int fibn(int n)
{
    int f[]=new int[n+1];
    f[0]=0;f[1]=1;
    for(int i=2;i<=n;i++)
    f[i]=f[i-2]+f[i-1];
    return f[n];
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println(fibn(n));
}
}