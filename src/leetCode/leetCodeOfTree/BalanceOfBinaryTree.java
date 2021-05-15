package leetCode.leetCodeOfTree;
/**
 * 平衡树左右子树高度差都小于等于 1
 */
public class BalanceOfBinaryTree
{
     private boolean result = true;

    public static void main(String[] args)
    {

    }

    /**
    public  boolean isBalanceed(TreeNode root)
    {
        maxDepth(root);
        return  result;
    }

    public static int maxDepth(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(1 - r) > 1)
        {
            result = false;
        }
        return 1 + Math.max(l,r);
    }
     */
}
