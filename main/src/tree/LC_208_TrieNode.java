package tree;

/**
 * 字典树(Tries树) 的一些总结
 * 字典树格式(26个字母)
 * 一个字典树是一系列字典TriesNode组成的数组，每一层都保持着26个数组槽位
 * 每个数组槽 如果不是end结点，都能指向下一个槽 以此类推
 * 字典树操作
 * 1. 插入：  插入保存在数组中，遍历字符插入的时候，数组索引使用 该字符与'a'的距离作为索引(a字符的索引为0)，
 * 如果是最后一个字符，设置该结点为 isEnd
 * 2. 查询：根据字符确定数组索引，来确定这个字符是否在字典树中 并且需要判断是否为尾结点(尾结点才符合要求)
 * 3. 模糊查询： 查询出来的结点，不需要判断是否为尾结点
 */
public class LC_208_TrieNode {

    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public LC_208_TrieNode() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode node = root;
        // 能搜到关键字，直接返回，不需要再插入
        if (null == word || search(word)) return;
        char[] words = word.toCharArray();
        for (char cr : words) {
            if (!node.containKey(cr)) {
                // 无当前字符，加进去
                node.put(cr, new TrieNode());
            }
            node = node.get(cr);
        }
        node.setEnd();
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return null != node && node.isEnd();
    }

    private TrieNode searchPrefix(String word) {
        if (null == word || word.length() == 0) return null;
        TrieNode node = root;
        for (char cr : word.toCharArray()) {
            if (node.containKey(cr)) {
                node = node.get(cr);
            } else {
                return null;
            }
        }
        return node;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return null != node;
    }
}
