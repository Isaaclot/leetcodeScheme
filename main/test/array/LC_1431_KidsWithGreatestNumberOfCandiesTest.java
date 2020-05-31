package array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/6/1
 */
public class LC_1431_KidsWithGreatestNumberOfCandiesTest {
    @Test
    public void should_get_kinds_with_candies() {

        LC_1431_KidsWithGreatestNumberOfCandies kids = new LC_1431_KidsWithGreatestNumberOfCandies();
        List<Boolean> res = Arrays.asList(true, true, true, false, true);
        assertThat(kids.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3), is(res));
    }
}
