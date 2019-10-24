package tree;

/**
 * 二叉树
 *
 * @author alis
 */
public class BinaryTree {

    private int val;

    private BinaryTree left, right;

    public BinaryTree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public static void init(BinaryTree root) {
        root.setLeft(new BinaryTree(5));
        root.setRight(new BinaryTree(15));
    }

    public static void preOrder(BinaryTree root) {
        if (null == root) return;
        System.out.println(root.getVal());
        preOrder(root.getLeft());
        preOrder(root.getRight());

    }

    public static void inOrder(BinaryTree root) {
        if (null == root) return;
        preOrder(root.getLeft());
        System.out.println(root.getVal());
        preOrder(root.getRight());
    }

    public static void postOrder(BinaryTree root) {
        if (null == root) return;
        preOrder(root.getLeft());
        preOrder(root.getRight());
        System.out.println(root.getVal());
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(10);
        init(root);
        System.out.println("+++++++++++++前序+++++++++++++");
        preOrder(root);
        System.out.println("+++++++++++++中序+++++++++++++");
        inOrder(root);
        System.out.println("+++++++++++++后序+++++++++++++");
        postOrder(root);
        System.out.println("+++++++++++++++++++++++++++++");
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }
}
