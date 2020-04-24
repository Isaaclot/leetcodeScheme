package dynamic_programming;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/17 10:52 PM
 * @description
 */
public class LC_64_MinPathSumTest {

    private LC_64_MinPathSum minPathSumDomain = new LC_64_MinPathSum();

    @Test
    public void testMinPathSumDomain() {
        assertThat(minPathSumDomain.minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        }), is(7));
    }

    @Test
    public void testMinPathSumDP_Review() {
        assertThat(minPathSumDomain.minPathSum_DP_Review(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        }), is(7));
    }

    @Test
    public void testMinPathSumDP_1_D() {
        assertThat(minPathSumDomain.minPathSum_DP_1_D(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        }), is(7));
    }
}
