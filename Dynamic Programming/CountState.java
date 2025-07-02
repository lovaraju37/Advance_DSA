
import java.util.*;
class CountState
{
public static int countState(int n)
{
    if(n==1||n==2)
    return n;
    else if(n==3)
    return 4;
    return countState(n-3)+countState(n-2)+countState(n-1);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println(countState(n));
}
}