package Arithmetic.Day05.bTree.binaryTree;

public class BinaryTreeDemo
{
    public static void main(String[] args)
    {
        BinaryTree binaryTree = new BinaryTree();//先创建一颗二叉树
        //创建所需要的节点
        HeroNode root = new HeroNode(1, "宋江");
        HeroNode node2 = new HeroNode(2, "吴用");
        HeroNode node3 = new HeroNode(3, "卢俊义");
        HeroNode node4 = new HeroNode(4, "林冲");
        HeroNode node5 = new HeroNode(5, "关胜");

        //手动创建该二叉树
        root.setLeft(node2);
        root.setRight(node3);
        node3.setRight(node4);
        node3.setLeft(node5);
        binaryTree.setRoot(root);

        //前序遍历
        System.out.println("前序遍历");
        binaryTree.preOrder();

        //中序遍历
        System.out.println("中序遍历");
        binaryTree.infixOrder();

        //后续遍历
        System.out.println("后续遍历");
        binaryTree.postOrder();

    }
}
