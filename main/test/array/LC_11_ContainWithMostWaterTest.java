package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author alis
 * @date 2019/10/17 10:58 PM
 * @description
 */
public class LC_11_ContainWithMostWaterTest {

    private LC_11_ContainWithMostWater containWithMostWater = new LC_11_ContainWithMostWater();
    private int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

    @Test
    public void maxArea() {
        assertEquals(containWithMostWater.maxArea(height), 49);
    }

    @Test
    public void maxAreaDoublePoint() {
        assertEquals(containWithMostWater.maxAreaDoublePoint(height), 49);
    }

    @Test
    public void maxAreaLoop() {
        assertEquals(containWithMostWater.maxAreaLoop(height), 49);
    }
}