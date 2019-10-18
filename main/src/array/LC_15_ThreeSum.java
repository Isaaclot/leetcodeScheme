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
     * @author Rico
     * @date 2019/10/18 1:06 PM
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
}
