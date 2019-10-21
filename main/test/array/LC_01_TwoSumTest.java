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

}
