package leetCode.leetCodeOfTree;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderOfBinaryTree
{
    public static void main(String[] args)
    {

    }
    //非递归 中序

    /*
    void dfs(TreeNode root)
    {
        dfs(root.left);
        System.out.println(root);
        dfs(root.right);
    }

     */


    //非递归 中序
    /**
    public List<Integer> inOrderTrave(TreeNode root)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        if (root == null)
        {
            return ret;
        }
         Stack<TreeNode>  stack =  new Stack<TreeNode>();
         TreeNode cur = root;
         while (cur != null || !stack.isEmpty())
         {
             while (cur != null)
             {
                 stack.push(cur);
                 cur = cur.left;
             }
             TeeeNode node = stack.pop();
             ret.add(node.val);
             cur = node.right;
         }
         return ret;
    }
    */
}
