package dynamic_programming;

import java.util.List;

/**
 * @author alis
 * @date 2019/11/20 12:25 AM
 * @description
 */
public class LC_120_MinimumTotal {
    /**
     * 三角形最小路径和
     * 重复性：最后一层的最小路径和等于上一层两个可能值的最小路径 加上 自身路径长度
     * 定义状态数组
     * dp方程：dp[i][j] = triangle[i][j] + min(triangle[i+1][j], triangle[i+1][j+1])
     * 自底向上: 从最后一行 往上递推
     *
     * @param
     * @return
     * @date 2019/11/20 12:31 AM
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int column = triangle.get(row - 1).size();
        int[][] dp = new int[row][column];
        for (int i = 0; i < column; i++) { // 设置最后一行的数据
            dp[row - 1][i] = triangle.get(row - 1).get(i);
        }
        for (int i = row - 2; i >= 0; --i) {// 边界： 第0行还需要计算
            for (int j = 0; j <= i; j++) {// 边界：列只需计算三角形范围内的数据(j<=i)
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        return dp[0][0];
    }


    /**
     * 自底向上：从最后一行往上反推进行DP方程计算
     * <p>
     * 12:59 AM	info
     * Success:
     * Runtime:3 ms,faster than 90.81% of Java online submissions.
     * Memory Usage:37.6 MB, less than 63.87% of Java online submissions.
     */
    public int minimumTotal2(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int column = triangle.get(rows - 1).size();
        int[][] dp = new int[rows][column];
        // 初始化最后一行的值
        for (int i = 0; i < column; i++) {
            dp[rows - 1][i] = triangle.get(rows - 1).get(i);
        }
        for (int i = rows - 2; i >= 0; --i) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        return dp[0][0];
    }

    /**
     * dp: 二维数组
     * 思路
     * 自底向上，(i,j) = min((i+1,j), (i+1, j+1)) + (i,j)
     * 由于需要求自顶向下顶最小路径之和，所以在dp过程中，还需要进行最优解计算min((i+1,j), (i+1, j+1))
     */
    public int minimumTotal3(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int column = triangle.get(rows - 1).size();
        int[][] dp = new int[rows][column];
        for (int i = 0; i < column; i++) {
            dp[rows - 1][i] = triangle.get(rows - 1).get(i);
        }
        for (int i = rows - 2; i >= 0; --i) {
            for (int j = 0; j <= i; ++j) {
                // 处理最优解
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }

    /**
     * dp方程:
     * i==j ? dp[i][j] = triangle.get(i).get(j) + dp[i - 1][j - 1];
     * i!=j ? dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
     */
    public int minimumTotal4(List<List<Integer>> triangle) {
        int row = triangle.size();
        int col = triangle.get(row - 1).size();
        int[][] dp = new int[row][col];
        // init
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < row; i++) {
            dp[i][0] = triangle.get(i).get(0) + dp[i - 1][0];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    dp[i][j] = triangle.get(i).get(j) + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < col; i++) {
            min = Math.min(min, dp[row - 1][i]);
        }
        return min;
    }


    /**
     * 一维dp方程, 自底向上
     */
    public int minimumTotal4_1D(List<List<Integer>> triangle) {
        int row = triangle.size();
        int col = triangle.get(row - 1).size();
        int[] dp = new int[col];
        // init
        for (int i = 0; i < col; i++) {
            dp[i] = triangle.get(row - 1).get(i);
        }
        for (int i = row - 2; i >= 0; --i) {
            for (int j = 0; j <= i; j++) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j + 1], dp[j]);
            }
        }
        return dp[0];
    }
}
