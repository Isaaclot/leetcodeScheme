package array;

/**
 * @author alis
 * @date 2019/10/17 12:57 AM
 * @description
 */
public class LC_11_ContainWithMostWater {
    public static void main(String[] args) {
        System.out.println(new LC_11_ContainWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        ;
    }

    /**
     * @param
     * @return
     * @author Rico
     * @description 双指针法，边界指针往中间遍历；如果指针碰撞，则推出寻最大值
     * @date 2019/10/17 1:08 AM
     */
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] > height[j] ? height[j--] : height[i++];
            int area = minHeight * (j - i + 1);
            max = Math.max(area, max);
        }
        return max;
    }

    public int maxAreaDoublePoint(int[] nums) {
        int max = 0;
        for (int i = 0, j = nums.length - 1; i < j; ) {
            int h = nums[i] > nums[j] ? nums[j--] : nums[i++];
            max = Math.max(max, h * (j - i + 1));
        }
        return max;
    }

    public int maxAreaLoop(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int area = (j - i) * Math.min(nums[j], nums[i]);
                max = Math.max(area, max);
            }
        }
        return max;
    }
}
