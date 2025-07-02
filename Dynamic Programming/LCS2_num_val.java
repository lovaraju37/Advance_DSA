
import java.util.*;
class LCS2_num_val
{
public static List<Integer> lcs(int[] a,int m,int[] b,int n)
{
    int dp[][]=new int[m+1][n+1];
    for(int i=1;i<=m;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(a[i-1]==b[j-1])
            {
                dp[i][j]=dp[i-1][j-1]+1;
            }
            else
            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
    }
    int i=m,j=n;
    List<Integer>ans= new ArrayList<>();
    while(i>0 && j>0)
    {
        if(a[i-1]==b[j-1])
        {
            ans.add(a[i-1]);
            i--;
            j--;
        }
        else if(dp[i-1][j]>dp[i][j-1])
        i--;
        else
        j--;
    }
    return ans.reversed();
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
        List<Integer>ans=lcs(a,m,b,n);
        for(Integer x:ans)
        System.out.print(x+" ");
}
}