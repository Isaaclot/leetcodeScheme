package recursion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/10/27 7:29 PM
 * @description
 */
public class LC_169_MajorityElementTest {

    private LC_169_MajorityElement majorityElement = new LC_169_MajorityElement();

    @Test
    public void majorityElementTest() {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        int element = majorityElement.majorityElement(nums);
        assertThat(element, is(2));
    }

    @Test
    public void majorityElementLoopTest() {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        int element = majorityElement.majorityElementLoop(nums);
        assertThat(element, is(2));
    }

    @Test
    public void majorityElementCase2Test() {
        int[] nums = new int[]{8, 8, 7, 7, 7};
        int element = majorityElement.majorityElement(nums);
        assertThat(element, is(7));
    }

    @Test
    public void majorityElementDivideTest() {
        assertThat(majorityElement.majorityElementDivide(new int[]{1,8, 8, 7, 7, 7}), is(7));
        assertThat(majorityElement.majorityElementDivide(new int[]{2, 2, 1, 1, 1, 2, 2}), is(2));
    }

    @Test
    public void majorityElementDivide2Test() {
        assertThat(majorityElement.majorityElementDivide2(new int[]{1,8, 8, 7, 7, 7}), is(7));
        assertThat(majorityElement.majorityElementDivide2(new int[]{2, 2, 1, 1, 1, 2, 2}), is(2));
    }
}
