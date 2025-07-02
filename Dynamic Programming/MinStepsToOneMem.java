import java.util.*;

class MinStepsToOneMem {
    public static int minSteps(int n, int prevResult) {
        if (n == 1) return prevResult;

        int res = minSteps(n - 1, prevResult + 1);
        if (n % 2 == 0) res = Math.min(res, minSteps(n / 2, prevResult + 1));
        if (n % 3 == 0) res = Math.min(res, minSteps(n / 3, prevResult + 1));

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minSteps(n, 0));
        sc.close();
    }
}
