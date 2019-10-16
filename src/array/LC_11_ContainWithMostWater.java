package array;

/**
 * @author alis
 * @date 2019/10/17 12:57 AM
 * @description
 */
public class LC_11_ContainWithMostWater {
    public static void main(String[] args) {
        System.out.println(new LC_11_ContainWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));;
    }

    /**
     * @author Rico
     * @description 双指针法，边界指针往中间遍历；如果指针碰撞，则推出寻最大值
     * @date 2019/10/17 1:08 AM
     * @param
     * @return
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
}
