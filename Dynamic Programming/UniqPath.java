
import java.util.*;

class UniqPath {
    public static int unqPath(int n,int m) {

        int dp[][]=new int[m][n];
        for(int i=1;i<m;i++)
        dp[i][0]=1;
        for(int i=1;i<n;i++)
        dp[0][i]=1;
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m,n: ");
        int m = sc.nextInt();
        int n=sc.nextInt();
        System.out.println(unqPath(n,m));
        sc.close();
    }
}
