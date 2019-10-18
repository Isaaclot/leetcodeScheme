package array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author alis
 * @date 2019/10/18 6:51 AM
 * @description
 */
public class LC_15_ThreeSumTest {

    private int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

    private LC_15_ThreeSum threeSum = new LC_15_ThreeSum();

    static List<List<Integer>> result = new ArrayList<>();

    static {
        result.add(Arrays.asList(-1, 0, 1));
        result.add(Arrays.asList(-1, -1, 2));
    }

    @Test
    public void threeSumLoopBoomTest() {
        List<List<Integer>> threeSumArrays = threeSum.threeSumLoopBoom(nums);
        assertEquals(threeSumArrays.size(), 2);
        for (List<Integer> sumArray : threeSumArrays) {
            assertEquals(sumArray.stream().mapToInt(Integer::intValue).sum(), 0);
        }

        List<List<Integer>> threeSumLoopBoom = threeSum.threeSumLoopBoom(new int[]{0, 0, 0, 0});
        assertEquals(threeSumLoopBoom.size(), 1);
        for (List<Integer> sumArray : threeSumLoopBoom) {
            assertEquals(sumArray.stream().mapToInt(Integer::intValue).sum(), 0);
        }
    }

 @Test
    public void threeSumDoublePointTest() {
        List<List<Integer>> threeSumArrays = threeSum.threeSumDoublePoint(nums);
        assertEquals(threeSumArrays.size(), 2);
        for (List<Integer> sumArray : threeSumArrays) {
            assertEquals(sumArray.stream().mapToInt(Integer::intValue).sum(), 0);
        }

        List<List<Integer>> threeSumLoopBoom = threeSum.threeSumDoublePoint(new int[]{0, 0, 0, 0});
        assertEquals(threeSumLoopBoom.size(), 1);
        for (List<Integer> sumArray : threeSumLoopBoom) {
            assertEquals(sumArray.stream().mapToInt(Integer::intValue).sum(), 0);
        }
    }



}
