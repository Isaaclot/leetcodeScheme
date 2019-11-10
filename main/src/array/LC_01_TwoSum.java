package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alis
 * @date 2019/10/20 3:58 PM
 * @description
 */
public class LC_01_TwoSum {

    /**
     * 暴力循环
     * O(n^2)
     * 中文网上使用哈希表的方式辅助判断有没有存在目标值的方式，说明时间复杂度是O(n),
     * 但是没考虑到哈希表对数据结构对处理，包括了扩容，排序，哈希计算等开销，如果从源码角度分析，这种算法恐怕比O(n^2)的时间复杂度更大
     */
    public int[] twoSumLoop(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 两遍哈希法
     * 将array 放在hashMap<num,index>中, 第一次遍历nums的时候，根据target - nums[i] 去判断是否在哈希表中
     * 如果存在，则说明，有符合条件的两个数组，否则，继续遍历
     */
    public int[] twoSum2Hash(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (sum.containsKey(target - nums[i]) && sum.get(target - nums[i]) != i) {
                return new int[]{i, sum.get(target - nums[i])};
            }
        }
        return new int[0];
    }


    /**
     * 1遍哈希
     * 遍历nums，
     * 如果在哈希中有target-nums[i], 则返回 map.get(target-nums[i], i)
     * 否则加入哈希表中 map.put(nums[i], i)
     */
    public int[] twoSum1Hash(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i]) && numMap.get(target - nums[i]) != i) {
                return new int[]{numMap.get(target - nums[i]), i};// 顺序相反，先加入哈希的值先返回
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[0];
    }

    /**
     * 用两遍哈希
     */
    public int[] twoSum4Week(int[] nums, int target) {
        if (nums.length == 0) return new int[0];
        Map<Integer, Integer> hash = new HashMap<>();
        // 第一遍哈希，先找出每个数所需要相加的数记录下来，并记录对应的下标
        for (int i = 0; i < nums.length; i++) {
            hash.put(target - nums[i], i);
        }
        // 第二遍哈希 找出当前数是否在数组中能找到想加起来结果为target的数
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i]) && hash.get(nums[i]) != i) {
                return new int[]{i, hash.get(nums[i])};
            }
        }
        return new int[0];
    }
}
