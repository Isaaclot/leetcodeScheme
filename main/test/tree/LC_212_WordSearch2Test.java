package tree;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author alis
 * @date 2019/11/23 11:48 PM
 * @description
 */
public class LC_212_WordSearch2Test {

    LC_212_WordSearch2 wordSearch2 = new LC_212_WordSearch2();

    @Test
    public void testWordSearch2() {
        assertArrayEquals(wordSearch2.findWords(new char[][]{{'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}}, new String[]{"oath", "pea", "eat", "rain"}).toArray(), Arrays.asList("oath", "eat").toArray());
        assertArrayEquals(wordSearch2.findWords(new char[][]{{'a', 'b'},
                {'c', 'd'}}, new String[]{"ab", "cb", "ad", "bd", "ac", "ca", "da", "bc", "db", "adcb", "dabc", "abb", "acb"}).toArray(), Arrays.asList("ab", "ac", "bd", "ca", "db").toArray());
    }
}
