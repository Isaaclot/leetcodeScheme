package recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alis
 * @date 2019/10/27 7:32 PM
 * @description
 */
public class LC_169_MajorityElement {


    public int majorityElement(int[] nums) {

        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> majorityMap = new HashMap<>();
        _generateMajorElement(0, nums, countMap);
        int res = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            Integer k = entry.getKey();
            if (entry.getValue() > count && entry.getValue() > nums.length / 2) {
                res = k;
                count = entry.getValue();
            }
        }
        return res;
    }

    /**
     * info
     * Success:
     * Runtime:21 ms,faster than 31.37% of Java online submissions.
     * Memory Usage:48 MB, less than 65.63% of Java online submissions.
     * 递归思路
     * terminator 遍历完数组就跳出
     * process    计数器逻辑处理
     * drill down
     * reverse states
     */
    private void _generateMajorElement(int currentIndex, int[] nums, Map<Integer, Integer> countMap) {
        // terminator
        if (currentIndex >= nums.length)
            return;
        // process
        if (countMap.containsKey(nums[currentIndex])) {
            countMap.put(nums[currentIndex], countMap.get(nums[currentIndex]) + 1);
        } else {
            countMap.put(nums[currentIndex], 1);
        }
        // drill down
        _generateMajorElement(currentIndex + 1, nums, countMap);
        // reverse states
    }

    /**
     * info
     * Success:
     * Runtime:27 ms,faster than 26.97% of Java online submissions.
     * Memory Usage:39.5 MB, less than 94.11% of Java online submissions.
     * 暴力循环：利用哈希表作为计数器实现
     */
    public int majorityElementLoop(int[] nums) {
        int maxCount = 0;
        int value = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if (map.get(num) > nums.length / 2 && map.get(num) > maxCount) {
                maxCount = map.get(num);
                value = num;
            }
        }
        return value;
    }

    /**
     * 分治解法: 拆分左右
     */
    public int majorityElementDivide(int[] nums) {
        return majorityElementRecur(nums, 0, nums.length-1);
    }

    private int majorityElementRecur(int[] nums, int lo, int hi) {
        // terminator
        if (lo == hi) {
            return nums[lo];
        }
        // process and split subProblems
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRecur(nums, lo, mid);
        int right = majorityElementRecur(nums, mid + 1, hi);

        // subResult
        // 如果两边的众数一样，则确认当前数字为整个序列的众数
        if (left == right) {
            return left;
        }
        // 计算从左右两个子序列得出的众数在整个序列中出现的次数
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);
        return leftCount > rightCount ? left : right;
    }

    private int countInRange(int[] nums, int target, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == target) count++;
        }
        return count;
    }
}
