package binarySearch;

/**
 * @author alis
 * @date 2019/11/3 3:55 PM
 * @description
 */
public class LC_69_MySqrt {

    /**
     * 二分查找的方式遍历计算X的平方根
     * 思路：二分法，从0到x/2+1 开始，利用二分法去遍历各个二分法情况
     * 注意：二分法去计算中位数的时候，会出现取整偏差的情况，(left + right) / 2 -> (left + right + 1)/2
     * 并且当left + right超出范围了，会出现溢出的情况，所以用long类型取运算，
     */
    public int mySqrtBinarySearch(int x) {
        long left = 0, right = x / 2 + 1;
        while (left < right) {
            long mid = (left + right + 1) >>> 1;
            if (mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }

    /**
     * 牛顿迭代法
     * https://leetcode-cn.com/problems/sqrtx/solution/er-fen-cha-zhao-niu-dun-fa-python-dai-ma-by-liweiw/
     */
    public int mySqrtNewTon(int x) {
        long a = x;
        while (a * a > x) {
            a = (a + x / a) / 2;
        }
        return (int) a;
    }
}
