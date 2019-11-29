package dynamic_programming;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/19 11:18 PM
 * @description
 */
public class LC_1143_LongestCommonSubsequenceTest {

    private LC_1143_LongestCommonSubsequence lcs = new LC_1143_LongestCommonSubsequence();

    @Test
    public void testLongestCommonSubsequence() {
        assertThat(lcs.longestCommonSubsequence("abcde", "ace"), is(3));
    }

    @Test
    public void testLongestCommonSubsequence2() {
        assertThat(lcs.longestCommonSubsequence2("abcde", "ace"), is(3));
    }

    @Test
    public void testLongestCommonSubsequence3() {
        assertThat(lcs.longestCommonSubsequence3("abcde", "ace"), is(3));
    }

}
