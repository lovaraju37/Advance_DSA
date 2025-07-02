import java.util.Scanner;

public class PrefixBrute {
    public static int  count(String s[],String x)
    {
        int c=0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].startsWith(x))
            /*return true*/c++;
        }
        //return false;
       return c;
    }
      public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
    String s[]=new String[n];

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            s[i]=word;
        }
    
    System.out.print("Enter the prefix to search:");
    String x=sc.nextLine();
    System.out.println(count(s,x));
}  
}
