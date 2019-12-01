package bit;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/12/1 8:10 AM
 * @description
 */
public class LC_191_HammingWeightTest {

    LC_191_HammingWeight hw = new LC_191_HammingWeight();

    @Test
    public void hammingWeightRemoveLastOneTest() {
        assertThat(hw.hammingWeightRemoveLastOne(00000000000000000000000000001011), is(3));
    }

    @Test
    public void hammingWeightRemoveLastIndexTest() {
        assertThat(hw.hammingWeightRemoveLastIndex(00000000000000000000000000001011), is(3));
    }

    @Test
    public void hammingWeightModTest() {
        assertThat(hw.hammingWeightMod(00000000000000000000000000001011), is(3));
    }
}
