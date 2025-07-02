import java.util.*;

    class LongestPalDp {
        public static String longPal(String s) {
            int n=s.length();
            boolean dp[][]=new boolean[n][n];
            int max=1,start=0;
            for(int i=0;i<n;i++)
            dp[i][i]=true;
            for(int i=0;i<n-1;i++)
            {
                if(s.charAt(i)==s.charAt(i+1))
                {
                    dp[i][i+1]=true;
                    if(max<2){
                    max=2;start=i;
                    }
                }
            }
            for(int k=3;k<n;k++)
            {
                for(int i=0;i<n-k+1;i++)
                {
                    int j=i+k-1;
                    if((dp[i+1][j-1]==true)&&(s.charAt(i)==s.charAt(j)))
                    {
                        dp[i][j]=true;
                        if(max<k)
                        {
                            max=k;
                            start=i;
                        }
                    }
                }
            }
            return s.substring(start, start+max);
            
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println(longPal(s));
            sc.close();
        }
    }
    