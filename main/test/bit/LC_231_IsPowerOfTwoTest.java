package bit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author alis
 * @date 2019/12/1 10:39 AM
 * @description
 */
public class LC_231_IsPowerOfTwoTest {
    LC_231_IsPowerOfTwo ipt = new LC_231_IsPowerOfTwo();

    @Test
    public void TestIsPowerOfTwo() {
        assertThat(ipt.isPowerOfTwo(1));
        assertThat(ipt.isPowerOfTwo(16));
        assertThat(!ipt.isPowerOfTwo(218));
    }
}
