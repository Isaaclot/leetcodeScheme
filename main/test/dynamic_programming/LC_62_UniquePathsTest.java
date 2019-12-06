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
    public void uniquePathsRecurVersion() {
        assertThat(uniquePathsService.uniquePathsRecur(7, 3), is(28));
    }

    @Test
    public void uniquePathsDpVersion() {
        assertThat(uniquePathsService.uniquePathsDP(7, 3), is(28));
    }

    @Test
    public void uniquePathsDpVersion2() {
        assertThat(uniquePathsService.uniquePathsDP2(7, 3), is(28));
    }

    @Test
    public void uniquePathsDpVersionSimple1() {
        assertThat(uniquePathsService.uniquePathsDpVersionSimple1(7, 3), is(28));
    }

    @Test
    public void uniquePaths2nd() {
        assertThat(uniquePathsService.uniquePathsDp2nd(7, 3), is(28));
        assertThat(uniquePathsService.uniquePathsRecur2nd(7, 3), is(28));
        assertThat(uniquePathsService.uniquePathsDpSimple2nd(7, 3), is(28));
    }

    @Test
    public void uniquePathsDP_reviewTest() {
        assertThat(uniquePathsService.uniquePathsDP_review(7, 3), is(28));
        assertThat(uniquePathsService.uniquePathsDP_review(7, 3), is(28));
        assertThat(uniquePathsService.uniquePathsDP_review(7, 3), is(28));
    }
}
