package Arithmetic.Day05.bTree.binaryTree;

public class HeroNode
{

    private int no;
    private String name;
    private HeroNode left;//默认null
    private HeroNode right;//默认null

    public HeroNode(int no,String name)
    {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    @Override
    public String toString()
    {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name  +
                '}';
    }

    public void setRight(HeroNode right)
    {
        this.right = right;
    }

    //前序遍历
    public void preOrder()
    {
        System.out.println(this);//先输出父节点
        if (this.left != null)
        {
            this.left.preOrder();//递归向左子树前序遍历
        }
        if (this.left != null)
        {
            this.right.preOrder();//递归向左子树前序遍历
        }
    }
     //中序遍历
    public void infixOrder()
    {
        if (this.left != null)
        {
            this.left.infixOrder();
        }
        System.out.println(this);//输出父节点
        if (this.right != null)
        {
            this.right.infixOrder();
        }
    }
    //后续遍历
    public void postOrder()
    {
        if (this.left != null)
        {
            this.left.infixOrder();
        }
        if (this.right != null)
        {
            this.right.infixOrder();
        }
        System.out.println(this);//输出父节点
    }

}
