package Arithmetic.Day05.bTree.binaryTreeInStore;

/*
  编写一个ArrBinaryTree，实现顺序存储二叉树遍历
 */
public class ArrBinaryTree
{
    private int[] arr;//存储数据节点的数组

    public ArrBinaryTree(int[] arr)
    {
        this.arr = arr;
    }

    /**
     *顺序存储二叉树的前序遍历
     * @param index 数组的下标
     */
    public void preOrder(int index)
    {
        if (arr == null || arr.length == 0)//如果数组为空
        {
            System.out.println("数组为空,不能按照二叉树的前序遍历");
        }
        System.out.printf("%d\t",arr[index]);//输出当前这个元素
        if ((index * 2 + 1 < arr.length))
        {
            preOrder(2 * index + 1);//向左递归遍历
        }
        if ((index * 2 + 2 < arr.length))
        {
            preOrder(index * 2 + 2);//向右递归遍历
        }
    }

    /**
     * 顺序存储二叉树的后序遍历
     * @param index 数组的下标
     */
    public void postOrder(int index)
    {
        if (arr == null || arr.length == 0)//如果数组为空
        {
            System.out.println("数组为空,不能按照二叉树的前序遍历");
        }
        if (index * 2  +1 < arr.length)
        {
            postOrder(index * 2 + 1);
        }
        if (index * 2 + 2 < arr.length)
        {
            postOrder(index * 2 + 2);
        }
        System.out.printf("%d\t",arr[index]);
//        System.out.print(arr[index]);

    }

}
