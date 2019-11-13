package dynamic_programming;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/13 12:54 PM
 * @description
 */
public class LC_62_UniquePathsTest {

    private LC_62_UniquePaths uniquePathsService = new LC_62_UniquePaths();

    @Test
    public void uniquePathsDpVersion() {
        assertThat(uniquePathsService.uniquePathsDp(7, 3), is(28));
    }
}
