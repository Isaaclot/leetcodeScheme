package bit;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/12/1 5:14 PM
 * @description
 */
public class LC_192_ReverseBitsTest {
    LC_192_ReverseBits rb = new LC_192_ReverseBits();

    @Test
    public void testReverseBits() {
        assertThat(rb.reverseBits(101), is(101));
    }
}
