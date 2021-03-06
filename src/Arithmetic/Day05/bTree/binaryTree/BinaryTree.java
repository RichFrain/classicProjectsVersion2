package Arithmetic.Day05.bTree.binaryTree;

public class BinaryTree
{
     private HeroNode root;


    public void setRoot(HeroNode root)
    {
        this.root = root;
    }

    //前序遍历
    public void preOrder()
    {
        if (this.root != null)
        {
            this.root.preOrder();
        }
        else
        {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    //中序遍历
    public void infixOrder()
    {
        if (this.root != null)
        {
            this.root.infixOrder();
        }
        else
        {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    //后续遍历
    public void  postOrder()
    {
        if (this.root != null)
        {
            this.root.postOrder();
        }
        else
        {
            System.out.println("二叉树为空，无法遍历");
        }
    }

}
