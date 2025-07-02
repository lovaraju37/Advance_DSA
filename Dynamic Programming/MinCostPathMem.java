import java.util.*;

class MinCostPathMem {
    public static int minCostPath(int[][] grid, int m, int n, int i, int j) {
        if (i == m - 1 && j == n - 1) return grid[i][j];
        if (i >= m || j >= n) return Integer.MAX_VALUE;

        int right = minCostPath(grid, m, n, i, j + 1);
        int down = minCostPath(grid, m, n, i + 1, j);
        int diagonal = minCostPath(grid, m, n, i + 1, j + 1);

        return grid[i][j] + Math.min(right, Math.min(down, diagonal));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int grid[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        System.out.println(minCostPath(grid, m, n, 0, 0));
        sc.close();
    }
}
