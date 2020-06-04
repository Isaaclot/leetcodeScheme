package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/6/4
 */
public class LC_238_ProductOfArrayExceptSelfTest {

    @Test
    public void should_product_excepted_self() {
        LC_238_ProductOfArrayExceptSelf self = new LC_238_ProductOfArrayExceptSelf();
        assertThat(self.productExceptSelf(new int[]{1, 2, 3, 4}), is(new int[]{24, 12, 8, 6}));
    }

}
