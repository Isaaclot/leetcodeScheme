package recursion;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/10/29 12:13 AM
 * @description
 */
public class LC_17_LetterCombinationsTest {

    private LC_17_LetterCombinations lc_17_letterCombinations = new LC_17_LetterCombinations();

    @Test
    public void letterCombinationsRecur(){
        assertThat(lc_17_letterCombinations.letterCombinationConquer("23"), is(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
        assertThat(lc_17_letterCombinations.letterCombinationConquer(""), is(Collections.emptyList()));
    }

    @Test
    public void letterCombinationsQueue(){
        assertThat(lc_17_letterCombinations.letterCombinationQueue("23"), is(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
        assertThat(lc_17_letterCombinations.letterCombinationQueue(""), is(Collections.emptyList()));
    }
}
