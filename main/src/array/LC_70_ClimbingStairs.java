package array;

/**
 * @author alis
 * @date 2019/10/17 1:09 AM
 * @description
 */
public class LC_70_ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(new LC_70_ClimbingStairs().climbStairs_memory(4));
    }

    /**
     * @param n
     * @return int
     * @author Rico
     * @description 斐波那契数动态规划
     * @date 2019/10/17 1:14 AM
     */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int p1 = 1, p2 = 2, p3 = 3;
        for (int i = 3; i < n + 1; i++) {
            p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
        }
        return p3;
    }

    /**
     * @param n 楼梯阶梯
     * @return int
     * @author Rico
     * @description 递归缓存法 O(n)
     * @date 2019/10/17 1:19 AM
     */
    public int climbStairs_memory(int n) {

        return climbingStairs(0, n, new int[n + 1]);
    }

    private int climbingStairs(int i, int n, int[] memory) {
        if (i > n) return 0;
        if (i == n) return 1;
        if (memory[i] > 0) {
            return memory[i];
        }

        memory[i] = climbingStairs(i + 1, n, memory) + climbingStairs(i + 2, n, memory);
        return memory[i];
    }


    public int climbStairs_twice_70(int n) {
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        int p1 = 1, p2 = 2, dp = 3;
        for (int i = 3; i < n + 1; i++) {
            dp = p1 + p2;
            p1 = p2;
            p2 = dp;
        }
        return dp;
    }

    /**
     * 爬楼梯
     */
    public int climbStairs_4Week(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int p1 = 1, p2 = 2, p3 = p1 + p2;
        for (int i = 3; i <= n; i++) {
            p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
        }
        return p3;
    }

    /**
     * 动态规划 dynamic programing
     * 拆分子问题，求解每个子问题的答案: f(n) = f(n-1) + f(n-2)
     */
    public int climbStairs_DP(int n) {
        if (n <= 2) return n;
        int p1 = 1, p2 = 2, p3 = 3;
        for (int i = 3; i <= n; i++) {
            p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
        }
        return p3;
    }

    /**
     * 题目：爬楼梯，每次只能怕 一步或者两步，问爬到第n阶阶梯有多少种走法
     * 思路：主要是训练动态规划，所以本次只考虑dp的解法
     * 1. 将一个复杂问题，拆分为重复简单的子问题：第n阶走法由第n-1阶和第n-2阶的阶梯走法相加而来
     * 2. 自顶向下递推：第3阶第走法，是第2阶和第一阶走法之和；而第2阶只能由第一阶上来，第一阶和第二阶的走法为：1、2
     * 3. 得出状态转移方程: f(n) = f(n-1) + f(n-2)
     */
    public int climbStairs_DP_review(int n) {
        int p1 = 1, p2 = 2, p3 = p1 + p2;
        if (n <= 2) return n;
        for (int i = 3; i <= n; i++) {
            p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
        }
        return p3;
    }

    /**
     * DP解法
     * 1. 将一个复杂问题，拆分为简单重复的子问题： 第n阶的是从第n-1阶或者第n-2阶楼梯上来，如果用统计第n阶，可以统计爬楼梯的人爬到第n-1阶和第n-2阶楼梯的不同走法之和
     * 2. 自顶向下递推：第三阶是从第2阶或者第1阶走上来，第1阶的不同走法是1，第2阶的不同走法是2
     * 3. 得出状态转移方程：f(n) = f(n-1) + f(n-2)
     */
    public int climbStairs_DP_review_3rd(int n) {
        int p1 = 1, p2 = 2, p3 = 3;
        if (n <= 2) return n;
        for (int i = 3; i <= n; i++) {
            p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
        }
        return p3;
    }
}
