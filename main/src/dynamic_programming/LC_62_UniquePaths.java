package dynamic_programming;

/**
 * @author alis
 * @date 2019/11/13 12:58 PM
 * @description
 */
public class LC_62_UniquePaths {

    /**
     * 动态规划：求从A点到B点有多少条路径
     * 划分子问题：opt(i,j) = opt(i-1,j) + opt(i,j-1)
     */
    public int uniquePathsDp(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return uniquePathsDp(m - 1, n) + uniquePathsDp(m, n - 1);
    }
}
