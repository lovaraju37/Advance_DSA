
import java.util.*;

class RatPath {
    public static int unqPath(int arr[][],int n) {

        int dp[][]=new int[m][n];
        for(int i=1;i<n;i++)
        {
            dp[i][0]=(arr[i][0]==1)?1:0;
        }
        for(int i=1;i<n;i++)
        {
            dp[0][i]=(arr[0][i]==1)?1:0;
        }
        for(int i=1;i<n;i++)
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
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;i<n;j++)
            arr[i][j]=sc.nextInt();
        }
        System.out.println(unqPath(arr,n));
        sc.close();
    }
}
