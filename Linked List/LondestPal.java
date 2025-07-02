import java.util.Scanner;

public class LondestPal {
    public static String longPal(String s){
        int n=s.length();
        int m=1,start=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(checkPal(s,i,j))
                {
                    if(j-i+1>m)
                    {
                        m=j-i+1;
                        start=i;
                    }
                }
            }
        }
        return s.substring(start,start+m);
    }
    public static boolean checkPal(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        System.out.println(longPal(s));

    }
}
