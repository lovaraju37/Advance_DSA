

import java.util.*;

class EditDistanceMem {
    public static int editDistance(String s1,int m,String s2,int n) {
        if(m==0)
        return n;
        if(n==0)
        return m;
        if(s1.charAt(m-1)==s2.charAt(n-1))
        return editDistance(s1, m-1, s2, n-1);
        else
        return 1+Math.min(editDistance(s1, m-1, s2, n),Math.min(editDistance(s1, m, s2, n-1),editDistance(s1, m-1, s2, n-1)));
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
