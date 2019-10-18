package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author alis
 * @date 2019/10/18 7:01 AM
 * @description
 */
public class LC_15_ThreeSum {

    /**
     * 暴力穷举，超出时间范围
     *
     * @param nums 操作目标数组
     * @return -
     */
    List<List<Integer>> threeSumLoopBoom(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<String> duplicateSer = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        if (!duplicateSer.contains(nums[i] + "-" + nums[j] + "-" + nums[k])) {
                            duplicateSer.add(nums[i] + "-" + nums[j] + "-" + nums[k]);
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                            result.add(temp.stream().sorted().collect(Collectors.toList()));
                        }
                    }
                }
            }
        }
        // 几秒前	超出时间限制	N/A	N/A	Java
        return result;
    }

    /**
     * 循环+双指针法
     * 拆解：
     * 确定三个指针，k(最左,最小), i(左边界), j(右边界)
     * 循环遍历 i与j之间 {
     * 判断左边界大于0，则不存在三数之和等于0
     * 重复计算判断：nums[k] == nums[k-1]
     * 求 i 和 j 的边界值 与三个数中的最左(小/k)元素 求和 sum
     * sum > 0 --> j-- (移动过程中需要判断旧位置与新位置的值是否一致，如果一致就不需要重新计算，再移动一个位置)
     * sum < 0 --> i++ (移动过程中需要判断旧位置与新位置的值是否一致，如果一致就不需要重新计算，再移动一个位置)
     * sum == 0 --> fill result 并i和j往中间移动(移动过程中需要判断旧位置与新位置的值是否一致，如果一致就不需要重新计算，再移动一个位置)
     * }
     *
     * @param nums 操作数组
     * @return -
     */
    List<List<Integer>> threeSumDoublePoint(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int k = 0;
        for (; k < nums.length - 2; k++) {
            if (nums[k] > 0) break;
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) ;
                } else if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) ;
                } else {
                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while (i < j && nums[i] == nums[++i]) ;
                    while (i < j && nums[j] == nums[--j]) ;
                }
            }
        }
        return result;
    }
}
