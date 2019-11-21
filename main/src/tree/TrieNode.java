package tree;

/**
 * @author alis
 * @date 2019/11/21 1:06 PM
 * @description
 */
public class TrieNode {

    private TrieNode[] links;

    private final int R = 26;

    private boolean isEnd;

    public TrieNode() {
        this.links = new TrieNode[R];
    }

    public boolean containKey(char ch) {
        return links[ch - 'a'] != null;
    }

    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }

    public void put(char ch, TrieNode node) {
        links[ch - 'a'] = node;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd() {
        isEnd = true;
    }
}
