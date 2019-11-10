package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author alis
 * @date 2019/10/17 10:48 PM
 * @description
 */
public class LC_70_ClimbingStairsTest {

    private LC_70_ClimbingStairs climbingStairs = new LC_70_ClimbingStairs();

    @Test
    public void climbStairs() {
        assertEquals(3, climbingStairs.climbStairs(3));
    }

    @Test
    public void climbStairs_memory() {
        assertEquals(5, climbingStairs.climbStairs(4));
    }

    @Test
    public void climbStairs_twice_70() {
        assertEquals(5, climbingStairs.climbStairs_twice_70(4));
        assertEquals(3, climbingStairs.climbStairs_twice_70(3));
    }

    @Test
    public void climbStairs_twice_4Week() {
        assertEquals(5, climbingStairs.climbStairs_4Week(4));
        assertEquals(3, climbingStairs.climbStairs_4Week(3));
    }
}