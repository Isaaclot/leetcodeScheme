package tree;

import java.util.List;

/**
 * @author alis
 * @date 2019/10/27 1:35 AM
 * @description
 */
public class NTreeNode {
    public int val;
    public List<NTreeNode> children;

    public NTreeNode() {}

    public NTreeNode(int _val,List<NTreeNode> _children) {
        val = _val;
        children = _children;
    }
};