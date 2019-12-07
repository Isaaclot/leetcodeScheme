package dynamic_programming;

/**
 * @author alis
 * @date 2019/11/17 2:16 AM
 * @description
 */
public class LC_63_UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int rows = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] dp = new int[rows][column];
        dp[0][0] = 1;
        for (int i = 1; i < rows; i++) {
            if (obstacleGrid[i][0] != 1) {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int j = 1; j < column; j++) {
            if (obstacleGrid[0][j] != 1) {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < column; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[rows - 1][column - 1];
    }

    /**
     * dp
     * 子问题：从(0,0)到达(i,j)的步数宗和
     * 状态定义
     * DP方程 dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
     *
     * @param
     * @return
     * @date 2019/11/19 10:03 AM
     */
    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) return 0;
        int rows = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] dp = new int[rows][column];
        dp[0][0] = 1;
        for (int i = 1; i < rows; i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = 0;
            } else {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int j = 1; j < column; j++) {
            if (obstacleGrid[0][j] == 0) {
                dp[0][j] = 0;
            } else {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < column; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[rows - 1][column - 1];
    }

    /**
     * 动态规划
     * 不同路径2(带障碍物版本)
     * 题意：从左上到右下，每次只能向右或者向下走，同时，地图中也有障碍物，有障碍物到点不能通过，不能纳入路径统计范围
     * 思路：
     * 1. 将复杂问题拆分重复简单子问题：第(i,j)步的路径是第(i-1,j)步和第(i,j-1)步路径之和
     * 2. 得出状态转移方程：f(i,j) = f(i-1,j) + f(i,j-1)
     * 3. 递推初始值和障碍物点
     */
    public int uniquePathsWithObstaclesDP_Review(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] dp = new int[rows][column];
        if (obstacleGrid[0][0] == 0) {
            dp[0][0] = 1;
        } else {
            return 0;
        }
        for (int i = 1; i < rows; i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int j = 1; j < column; j++) {
            if (obstacleGrid[0][j] == 0) {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < column; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return dp[rows - 1][column - 1];
    }
}
