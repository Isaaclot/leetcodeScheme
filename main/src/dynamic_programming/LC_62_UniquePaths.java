package dynamic_programming;

import java.util.Arrays;

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

    /**
     * 统计路径动归2刷
     *
     * @param m,n
     * @return
     * @date 2019/11/17 1:58 AM
     */
    public int uniquePathsDP2(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i <= m - 1; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j <= n - 1; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    /**
     * dp简化版本，从第一列都是1 的开始，只记录一列数据，下一列由前一列算出
     *
     * @param
     * @return
     * @date 2019/11/17 2:07 AM
     */
    public int uniquePathsDpVersionSimple1(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // 初始化值
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }

    /**
     * 递归
     */
    public int uniquePathsRecur2nd(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        return uniquePathsRecur2nd(m - 1, n) + uniquePathsRecur2nd(m, n - 1);
    }

    /**
     * DP
     * 思路
     * 从左上到右下，每次只能向右或者向下走
     * (1,1)结点的路径数是(1,0)和(0,1)结点路径数之和
     * 可以得出DP方程: dp[i][j] = dp[i-1][j] + dp[i][j-1]
     * 而对于 (i,0)和(0,j)结点的路径数，只能由上一个结点过来，所以路径数等于(i-1,0)或者(0,j-1)的路径数
     */
    public int uniquePathsDp2nd(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    /**
     * dp只用一维数组做输出存储
     * 思路：
     * 只存储一行数据，初始化第一行的时候，全都是1
     * 第二行用dp方程
     * 如果是第二行的第一位，则其路径数等于第一行的第一位的路径数
     * 第二行的非第一位，则是通过DP方程计算: dp[i] = dp[i](上一行的第i位的路径数) + dp[i-1]
     */
    public int uniquePathsDpSimple2nd(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < m; i++) { // 遍历行
            for (int j = 1; j < n; j++) { // 遍历列
                // 第i行，第j列
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
