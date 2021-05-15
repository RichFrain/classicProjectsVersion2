package leetCode.leetCodeOfTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostorderOfBinaryTree
{
    public static void main(String[] args)
    {

    }

    //递归后续
    /**
    void dfs(TreeNode root)
    {
        dfs(root.left);
        dfs(root.right);
        System.out.println(root);
    }
    */

    //非递归后续
    //前序遍历为 root -> left -> right，后序遍历为 left -> right -> root。
    // 可以修改前序遍历成为 root -> right -> left，那么这个顺序就和后序遍历正好相反。
    /**
    public List<Integer> preOrderTravel(TreeNode root)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (! stack.isEmpty())
        {
            TreeNode node = stack.pop();
            if (node == null)
            {
                continue;
            }
            ret.add(node.val);
            //先右后左，保证左子树先遍历
            stack.push(node.left);
            stack.push(node.right);
        }
        Collections.reverse(ret);
       return ret;
    }
     */
}
