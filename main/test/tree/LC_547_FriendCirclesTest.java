package tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/24 1:53 PM
 * @description
 */
public class LC_547_FriendCirclesTest {
    LC_547_FriendCircles friendCircles = new LC_547_FriendCircles();

    @Test
    public void testFriendCirclesDFS() {
        assertThat(friendCircles.findCircleNumDFS(new int[][]{{1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}}), is(1));
    }

    @Test
    public void testFriendCirclesUnion() {
        assertThat(friendCircles.findCircleNumUnion(new int[][]{{1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}}), is(1));
    }
}
