
import java.util.*;

class EditDistanceTab {
    public static int editDistance(String s1,int m,String s2,int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++)
        dp[i][0]=i;
        for(int i=0;i<n;i++)
        dp[0][i]=i;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1];
                else
                dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;

                
            }
        }
       return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1:");
        String s1=sc.nextLine();
        System.out.print("Enter String 2:");
        String s2=sc.nextLine();
        System.out.println(editDistance(s1,s1.length(),s2,s2.length()));
        sc.close();
    }
}
