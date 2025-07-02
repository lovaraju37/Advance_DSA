
import java.util.*;
class HouseRobber
{
public static int houseRobber(int h[],int n)
{
    int dp[]=new int[n+1];
    dp[0]=0;dp[1]=h[0];
    for(int i=2;i<=n;i++)
    dp[i]=Math.max(h[i-1]+dp[i-2],dp[i-1]);
    return dp[n];
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter the money:");
        int h[]=new int[n];
        for(int i=0;i<n;i++)
        h[i]=sc.nextInt();
        System.out.println(houseRobber(h,n));
}
}