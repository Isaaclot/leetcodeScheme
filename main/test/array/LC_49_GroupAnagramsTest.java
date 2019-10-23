package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * @author alis
 * @date 2019/10/23 12:49 PM
 * @description
 */
public class LC_49_GroupAnagramsTest {

    LC_49_GroupAnagrams lc_49_groupAnagrams = new LC_49_GroupAnagrams();

    @Test
    public void groupAnagramsTest() {
        List<List<String>> groupAnagrams = lc_49_groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        List<List<String>> assertList = new ArrayList<>();
        assertList.add(Arrays.asList(new String[]{"nat", "tan"}));
        assertList.add(Arrays.asList(new String[]{"bat"}));
        assertList.add(Arrays.asList(new String[]{"ate", "eat", "tea"}));
        assertTrue(!groupAnagrams.isEmpty());
        Assert.assertArrayEquals(assertList.toArray(), groupAnagrams.toArray());
    }
}
