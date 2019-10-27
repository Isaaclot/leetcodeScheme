package tree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author alis
 * @date 2019/10/27 9:09 AM
 * 题目理解：
 * 将一个二叉树的所有结点，从上往下，输出，
 * 输出的规则是，逐层输出，输出每一层的时候，该层的结点，从左往右一起输出到该层的集合中
 * --> 前序遍历类似
 */
public class LC_429_NTreeLevelOrder {

    /**
     * 递归实现
     * 核心思想：每次递归以层为基本单位，需要从根结点开始就将每一层的所有节点找齐，
     * 在每一层处理的时候，利用哈希表/数组将每一层的结点都遍历出来，这个遍历结果就是输出的时候本层次的数据
     */
    public List<List<Integer>> levelOrderRecur(NTreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        /* Map<Integer, List<Integer>> resultMap = new HashMap<>();*/
        List<List<Integer>> result = new ArrayList<>();
        _generateLevelOrder(0, Arrays.asList(root), result);
        return result;
    }

    private void _generateLevelOrder(int level, List<NTreeNode> roots, List<List<Integer>> result) {
        if (roots == null || roots.isEmpty()) return;
        // process 将本根层的所有子结点遍历出来
        List<NTreeNode> childRoots = new ArrayList<>();
        roots.stream().forEach(root -> {
            if (root.children != null && !root.children.isEmpty()) {
                childRoots.addAll(root.children);
            }
        });
        result.add(roots.stream().map(value -> value.val).collect(Collectors.toList()));
        _generateLevelOrder(level + 1, childRoots, result);
    }
}
