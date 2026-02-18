package PreviousYear;

/**
 * Problem Statement:
 * Given a grid of size m*n, let us assume you are starting at (1, 1) and your goal is to reach (m, n).
 * At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).
 * Now consider if some obstacles are added to the grids.
 * How many unique paths would there be? An obstacle and space are marked as 1 and 0 respectively in the grid.
 * sample test case n=3,m= 3
 * arr = [
 * [0 0 0],
 * [0 1 0],
 * [0 0 0]
 * ]
 * output: 2
 */
public class Grind {


        public static int uniquePathsWithObstacles(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            int[][] dp = new int[m][n];

            // if start is blocked
            if (grid[0][0] == 1) return 0;

            dp[0][0] = 1;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (grid[i][j] == 1) {
                        dp[i][j] = 0;  // obstacle
                    } else {
                        if (i > 0) dp[i][j] += dp[i - 1][j];  // from top
                        if (j > 0) dp[i][j] += dp[i][j - 1];  // from left
                    }
                }
            }

            return dp[m - 1][n - 1];
        }




        public static int countPaths(int[][] grid, int i, int j) {
            int m = grid.length;
            int n = grid[0].length;

            // out of bounds or obstacle
            if (i >= m || j >= n || grid[i][j] == 1) {
                return 0;
            }

            // reached destination
            if (i == m - 1 && j == n - 1) {
                return 1;
            }

            // move right + move down
            return countPaths(grid, i, j + 1) + countPaths(grid, i + 1, j);
        }

        public static int uniquePathsWithObstaclesRecursion(int[][] grid) {
            return countPaths(grid, 0, 0);
        }

    public static void main(String[] args) {
        int[][] maze = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };
        int m = 3;
        int n = 3;
        int ways = uniquePathsWithObstacles(maze);
        System.out.println(ways);
    }
}
