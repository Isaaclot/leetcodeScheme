package dynamic_programming;

/**
 * @author alis
 * @date 2019/11/13 12:58 PM
 * @description
 */
public class LC_62_UniquePaths {

    /**
     * 2:16 PM	info
     * Compile Error:
     * Time Limit Exceeded
     * 递归求解：求从A点到B点有多少条路径
     */
    public int uniquePathsRecur(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return uniquePathsRecur(m - 1, n) + uniquePathsRecur(m, n - 1);
    }

    /**
     * 动态规划求解
     * 划分子问题：opt(i,j) = opt(i-1,j) + opt(i,j-1)
     * 时间复杂度: O(N*N)
     */
    public int uniquePathsDP(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
