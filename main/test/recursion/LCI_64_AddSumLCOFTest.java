package recursion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/6/2
 */
public class LCI_64_AddSumLCOFTest {
    @Test
    public void should_add_sum_nums() {
        LCI_64_AddSumLCOF sum = new LCI_64_AddSumLCOF();
        assertThat(sum.sumNums(3), is(6));
    }

    @Test
    public void should_add_sum_nums_9_get_45() {
        LCI_64_AddSumLCOF sum = new LCI_64_AddSumLCOF();
        assertThat(sum.sumNums(9), is(45));
    }
}
