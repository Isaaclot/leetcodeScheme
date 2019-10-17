package array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author alis
 * @date 2019/10/17 11:02 AM
 * @description
 */
public class LC_283_MoveZeroesTest {

    private LC_283_MoveZeroes moveZeroes = new LC_283_MoveZeroes();

    // 结果校验指标 , 从leetCode题目或者testcase提供的测试用例中取，用来作为tdd验证标准，必要情况下，设置一些边界值校验等

    // TODO: 2019/10/17 testcase方法应该抽出来，不需要每一种解法都对接一个testcase方法

    @Test
    public void moveZeroes() {
        int numsCase1[] = new int[]{1, 0, 3, 0, 12};
        int[] numsCase2 = {0, 0, 1};
        moveZeroes.moveZeroes(numsCase1);
        moveZeroes.moveZeroes(numsCase2);
        assertArrayEquals(numsCase1, new int[]{1, 3, 12, 0, 0});
        assertArrayEquals(numsCase2, new int[]{1, 0, 0});
    }

    @Test
    public void moveZeroes1() {
        int[] numsCase1 = {1, 0, 3, 0, 12};
        int[] numsCase2 = {0, 0, 1};
        moveZeroes.moveZeroes1(numsCase1);
        moveZeroes.moveZeroes1(numsCase2);
        assertArrayEquals(numsCase1, new int[]{1, 3, 12, 0, 0});
        assertArrayEquals(numsCase2, new int[]{1, 0, 0});
    }

    @Test
    public void moveZeroes3() {
        int[] numsCase1 = {1, 0, 3, 0, 12};
        int[] numsCase2 = {0, 0, 1};
        moveZeroes.moveZeroes3(numsCase1);
        moveZeroes.moveZeroes3(numsCase2);
        assertArrayEquals(numsCase1, new int[]{1, 3, 12, 0, 0});
        assertArrayEquals(numsCase2, new int[]{1, 0, 0});
    }

    @Test
    public void moveZeroes_twice_1016() {
        int[] numsCase1 = {1, 0, 3, 0, 12};
        int[] numsCase2 = {0, 0, 1};
        moveZeroes.moveZeroes_twice_1016(numsCase1);
        moveZeroes.moveZeroes_twice_1016(numsCase2);
        assertArrayEquals(numsCase1, new int[]{1, 3, 12, 0, 0});
        assertArrayEquals(numsCase2, new int[]{1, 0, 0});
    }
}