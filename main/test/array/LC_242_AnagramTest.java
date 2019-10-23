package array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author alis
 * @date 2019/10/23 9:52 AM
 * @description
 */
public class LC_242_AnagramTest {

    private LC_242_Anagram anagram = new LC_242_Anagram();

    @Test
    public void isAnagram() {
        assertTrue(anagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void isAnagramHashTest() {
        assertTrue(anagram.isAnagramHash("anagram", "nagaram"));
    }

}
