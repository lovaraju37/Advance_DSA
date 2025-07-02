
import java.util.*;
class LCS2_Val
{
public static String lcs(String s1,int m, String s2,int n)
{
    int dp[][]=new int[m+1][n+1];
    StringBuilder sb=new StringBuilder();
    for(int i=1;i<=m;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                dp[i][j]=dp[i-1][j-1]+1;
            }
            else
            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
    }
    int i=m,j=n;
    while(i>0 && j>0)
    {
        if(s1.charAt(i-1)==s2.charAt(j-1))
        {
            sb.append(s1.charAt(i-1));
            i--;
            j--;
        }
        else if(dp[i-1][j]>dp[i][j-1])
        i--;
        else
        j--;
    }
    sb.reverse();
    return sb.toString();
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter strings1:");
        String s1=sc.nextLine();
       System.out.println("Enter string 2:");
       String s2=sc.nextLine();
       int m=s1.length(),n=s2.length();
       System.out.println(lcs(s1,m,s2,n));
}
}