package dynamic_programming;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/17 2:12 AM
 * @description
 */
public class LC_63_UniquePathsWithObstaclesTest {

    private LC_63_UniquePathsWithObstacles uniquePathsWithObstaclesDomain = new LC_63_UniquePathsWithObstacles();

    @Test
    public void testUniquePathsWithObstacles() {
        assertThat(uniquePathsWithObstaclesDomain.uniquePathsWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }), is(2));

        assertThat(uniquePathsWithObstaclesDomain.uniquePathsWithObstacles(new int[][]{
                {1, 0}
        }), is(0));

        assertThat(uniquePathsWithObstaclesDomain.uniquePathsWithObstacles(new int[][]
                {{0, 0}, {1, 1}, {0, 0}}
        ), is(0));

        assertThat(uniquePathsWithObstaclesDomain.uniquePathsWithObstacles2(new int[][]
                {{0, 0}, {1, 1}, {0, 0}}
        ), is(0));
    }

    @Test
    public void testUniquePathsWithObstaclesDP_Review() {
        assertThat(uniquePathsWithObstaclesDomain.uniquePathsWithObstaclesDP_Review(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }), is(2));

        assertThat(uniquePathsWithObstaclesDomain.uniquePathsWithObstaclesDP_Review(new int[][]{
                {1, 0}
        }), is(0));

        assertThat(uniquePathsWithObstaclesDomain.uniquePathsWithObstaclesDP_Review(new int[][]
                {{0, 0}, {1, 1}, {0, 0}}
        ), is(0));
    }
}
