package array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author alis
 * @date 2019/10/20 3:54 PM
 * @description
 */
public class LC_01_TwoSumTest {

    private LC_01_TwoSum twoSum = new LC_01_TwoSum();

    private int[] nums = new int[]{2, 7, 11, 15};

    @Test
    public void addTwoSumTest() {
        assertArrayEquals(twoSum.twoSumLoop(nums, 9), new int[]{0, 1});

    }

    @Test
    public void twoSum2HashTest() {
        assertArrayEquals(twoSum.twoSum2Hash(nums, 9), new int[]{0, 1});
        assertArrayEquals(twoSum.twoSum2Hash(new int[]{3, 2, 4}, 6), new int[]{1, 2});
    }

    @Test
    public void twoSum1HashTest() {
        assertArrayEquals(twoSum.twoSum1Hash(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        assertArrayEquals(twoSum.twoSum1Hash(nums, 9), new int[]{0, 1});

    }

    @Test
    public void twoSum1HashTest_4Week() {
        assertArrayEquals(twoSum.twoSum4Week(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        assertArrayEquals(twoSum.twoSum4Week(nums, 9), new int[]{0, 1});

    }

}
