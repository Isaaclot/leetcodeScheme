package array;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/6/4
 */
public class LC_238_ProductOfArrayExceptSelf {
    /**
     * 空间换时间：除了自身所有元素的乘积是当前元素 = 左右所有乘积 * 右边所有乘积
     *
     * @return {@link }
     * @since 2020/6/4 1:21 PM
     */
    public int[] productExceptSelf(int[] nums) {
        if (nums == null) return new int[]{};
        int[] leftProducts = new int[nums.length];
        int[] rightProducts = new int[nums.length];
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            leftProducts[i] = i == 0 ? 1 : leftProducts[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            rightProducts[i] = i == nums.length - 1 ? 1 : rightProducts[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        return result;
    }
}
