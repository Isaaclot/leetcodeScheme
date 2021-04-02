package sword_offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2021/3/6
 */
public class O3DuplicateNumber {
    public int findRepeatNumber_01(int[] nums) {
        List<Integer> dupList = new ArrayList<>(nums.length);
        for (int num : nums) {
            if (dupList.contains(num)) {
                return num;
            } else {
                dupList.add(num);
            }
        }
        return 0;
    }

    /**
     * 原地替换 O(n)
     *
     * @param nums 数字均在0到n-1之间的数组
     * @return {@link int}
     * @since 2021/3/6 10:19 AM
     */
    public int findRepeatNumber_02(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;

            }
        }

        return 0;
    }
}
