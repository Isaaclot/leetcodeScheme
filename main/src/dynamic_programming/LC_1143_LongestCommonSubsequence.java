package dynamic_programming;

/**
 * @author alis
 * @date 2019/11/19 11:20 PM
 * @description
 */
public class LC_1143_LongestCommonSubsequence {

    /**
     * 最大子序列长度
     * DP：
     * 分解子问题: 将两个字符的相关计算，转化为二维，二维能给更加直观的计算两个字符串的关系
     * s1字符串分解为最后一个字符和s1.length()-1前的字符与s2字符串最后一个字符和s2.length()-1前的字符的组合计算
     * 确定状态
     * DP方程: dp[i][j] = dp[i - 1][j - 1] + 1;dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
     * <p>
     * 11:45 PM	info
     * Success:
     * Runtime:52 ms,faster than 5.76% of Java online submissions.
     * Memory Usage:41 MB, less than 100.00% of Java online submissions.
     *
     * @param
     * @return
     * @date 2019/11/19 11:20 PM
     */
    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length() + 1;// 使用s1长度+1初始化，在dp[1][1]的时候，可以利用dp方程计算从dp[0][0]或者dp[0][1]|dp[1][0]得出
        int n = s2.length() + 1;
        int[][] dp = new int[m][n];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if ((s1.charAt(i - 1) + "").equals(s2.charAt(j - 1) + "")) {
                    // 如果当前对比序列，最后一位一样，可以当作dp[i - 1][j - 1] + 1
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 如果当前两个序列的最后一位不一致，则选择s1-1和s2-1中最大长度的选项
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    /**
     * 注意边界: 需要预留一列和一行用来递推初始值, [i][0], [0][j]默认为0，因为这行/列是空字符串列
     */
    public int longestCommonSubsequence2(String text1, String text2) {
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int[][] dp = new int[t1.length + 1][t2.length + 1];
        for (int i = 1; i < t1.length + 1; i++) {
            for (int j = 1; j < t2.length + 1; j++) {
                if (t1[i - 1] == t2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[t1.length][t2.length];
    }
}
