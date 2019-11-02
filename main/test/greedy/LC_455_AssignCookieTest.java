package greedy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/3 1:02 AM
 * @description
 */
public class LC_455_AssignCookieTest {

    private LC_455_AssignCookie assignCookie = new LC_455_AssignCookie();


    @Test
    public void findContendChildren() {
        assertThat(assignCookie.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}), is(1));
        assertThat(assignCookie.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}), is(2));
        assertThat(assignCookie.findContentChildren(new int[]{10,9,8,7}, new int[]{5,6,7,8}), is(2));
    }
}
