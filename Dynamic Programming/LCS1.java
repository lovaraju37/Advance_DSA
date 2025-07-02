
import java.util.*;
class LCS1
{
public static int lcs(String s1,int m, String s2,int n)
{
    if(m==0||n==0) return 0;
    else if(s1.charAt(m-1)==s2.charAt(n-1))
    return 1+lcs(s1, m-1, s2, n-1);
    else
    return Math.max(lcs(s1, m-1, s2, n),lcs(s1, m, s2, n-1));
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