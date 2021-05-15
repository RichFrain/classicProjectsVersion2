package Arithmetic.Day05.bTree.binaryTreeInStore;

public class BinaryTreeInStore
{
    public static void main(String[] args)
    {
      int[] arr = {1,2,3,4,5,6,7};
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
        System.out.print("前序遍历：");
        arrBinaryTree.preOrder(0);
        System.out.println();
        System.out.print("后序遍历:");
        arrBinaryTree.postOrder(0);

    }

}
