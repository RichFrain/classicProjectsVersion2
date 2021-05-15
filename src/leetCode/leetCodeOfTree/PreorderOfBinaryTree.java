package leetCode.leetCodeOfTree;

import javax.swing.tree.TreeNode;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 层次遍历使用 BFS 实现，利用的就是 BFS 一层一层遍历的特性；
 * 而前序、中序、后序遍历利用了 DFS 实现。
 * 前序、中序、后序遍只是在对节点访问的顺序有一点不同，其它都相同。
 */
public class PreorderOfBinaryTree
{
    public static void main(String[] args)
    {

    }
    //递归前序
    /**
    void dfs(TreeNode root)
    {
        System.out.println(root);
        dfs(root.left);
        dfs(root.right);
    }
    */

    //非递归前序

    /**
    public List<Integer> preOrderTraver(TreeNode root)
    {
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode>  stack =  new Stack<>();
        stack.push(root);
        while (! stack.isEmpty())
        {
            TreeNode node = stack.pop();
            if (node == null)
            {
                continue;
            }
            ret.add(node.val);
            // 先右后左，保证左子树先遍历
            stack.push(node.right);
            stack.push(node.left);
        }
        return ret;
    }
     */


}
