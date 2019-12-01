package bit;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author alis
 * @date 2019/12/1 5:32 PM
 * @description
 */
public class LC_338_CountBitsTest {

    LC_338_CountBits cb = new LC_338_CountBits();

    @Test
    public void countBitsTest() {
        assertArrayEquals(cb.countBits(2), new int[]{0, 1, 1});
    }

    @Test
    public void countBitsDPTest() {
        assertArrayEquals(cb.countBitsDP1(2), new int[]{0, 1, 1});
    }

    @Test
    public void countBitsDP2Test() {
        assertArrayEquals(cb.countBitsDP2(2), new int[]{0, 1, 1});
    }
}
