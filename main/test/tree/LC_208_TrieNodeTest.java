package tree;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author alis
 * @date 2019/11/21 12:47 PM
 * @description
 */
public class LC_208_TrieNodeTest {
    LC_208_TrieNode trie = new LC_208_TrieNode();

    @Test
    public void trieInsertTest() {
        trie.insert("apple");
    }

    @Test
    public void trieSearchTest() {
        trie.insert("apple");
        // search需要先插入才能查找
        assertTrue(trie.search("apple"));
        assertTrue(trie.startsWith("app"));
    }
}
