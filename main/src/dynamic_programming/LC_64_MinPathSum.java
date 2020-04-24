package dynamic_programming;

/**
 * @author alis
 * @date 2019/11/17 10:54 PM
 * @description
 */
public class LC_64_MinPathSum {
    /**
     * 解法：暴力遍历所有路径的和的解法就不实现了，就算实现出来也是超时；
     * 直接使用DP来实现
     * 最优dp方程：dp(i,j)=grid(i,j)+min(dp(i+1,j),dp(i,j+1))
     * dp三部曲：
     * 1. 子问题
     * 2. 状态定义
     * 3. DP方程
     *
     * @param grid 网格
     * @return
     * @date 2019/11/17 10:55 PM
     */
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int column = grid[0].length;
        if (rows == 0 && column == 0) return 0;
        int[][] dp = new int[rows][column];
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = column - 1; j >= 0; j--) {

                if (i == rows - 1 && j != column - 1)
                    // 最后一行排除最后一列的节点([rows-1][column-1])
                    // 最后一行的路径数计算只会从上一步加过来
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                else if (j == column - 1 && i != rows - 1)
                    // 最后一列排除最后一行的节点[rows-1][column-1]
                    // 当前节点计数需要从上一个节点反推
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                else if (j != column - 1 && i != rows - 1)
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                else
                    dp[i][j] = grid[i][j];
            }
        }
        return dp[0][0];
    }

    /**
     * 最小路径和
     * dp版本思路
     * 1. 第(i,j)个格子，是从(i-1,j)或者是(i,j-1)走过来，而选择哪条路径，则按照选择路径数最少的那个格子过来，并且计算当前格子的路径和的时候，需要加上自身
     * 2. 状态转移方程：f(i,j) = grid(i,j) + min(f(i-1,j), f(i,j-1))
     * 3. 递推初始值，将(i,0)和(0,j)行/列填满，再进行递推过程
     */
    public int minPathSum_DP_Review(int[][] grid) {
        int rows = grid.length;
        int column = grid[0].length;
        int[][] dp = new int[rows][column];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int j = 1; j < column; j++) {
            dp[0][j] = grid[0][j] + dp[0][j - 1];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < column; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[rows - 1][column - 1];
    }

    public int minPathSum_DP_1_D(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] dp = new int[col];
        //init
        dp[0] = grid[0][0];
        for (int i = 1; i < col; i++) {
            dp[i] = dp[i-1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j==0) {
                    dp[j] += grid[i][j];
                } else {
                    dp[j] = grid[i][j] + Math.min(dp[j], dp[j-1]);
                }
            }
        }
        return dp[col-1];
    }
}
