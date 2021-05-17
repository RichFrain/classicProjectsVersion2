package Arithmetic.Day03.sort.heapSort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 原始数组: [4,6,8,5,9]
 *            0 1 2 3 4
 *
 */
public class HeapSortVersion1
{
    public static void main(String[] args)
    {
        int[] arr = {4,6,8,5,9};
        heapSort(arr);

    }

    public static void heapSort(int[] arr)
    {
        int temp = 0;
        System.out.println("堆排序");
        //分布完成
        adjustHeap(arr,1,arr.length);
        System.out.println("第一次"+ Arrays.toString(arr));
        adjustHeap(arr,0,arr.length);
        System.out.println("第二次"+ Arrays.toString(arr));
    }

    /**
     * 将一个二叉树(其实就是调整数组)调整为一个大顶堆
     * 从最后一个非叶节点开始，因为叶节点自然不用调整
     * 第一个非叶节点 arr.length/2 -1 = 5/2 -1 = 1;
     * 从左至右，从上至下进行调整
     * @param arr 待调整的数组
     * @param i 表示非叶节点在数组中的索引
     * @param length 表示对多少个元素进行调整，length 是在逐渐减少
     *
     */
     public static void adjustHeap(int[] arr,int i,int length)
     {
         int temp = arr[i];//先取出当前元素的值，保存在临时变量
         //  k = i * 2 + 1; k 是i节点的左子节点
         for(int k = i*2 + 1;k < length;k = k*2 + 1)
         {
             if (k + 1 < length && arr[k] < arr[k+1])//说明左子节点的值小于右子节的值
             {
                 k++;//k指向右子节点
             }
             if (arr[k] > temp)//如果子节点大于父节点
             {
                 arr[i] = arr[k];//把较大的值赋给当前节点
                 i = k;//i 指向 k,继续循环比较
             }
             else
             {
                 break;
             }
         }
         //当for循环结束后，已经将以i为父节点的树的最大值，放在了最顶部
          arr[i] = temp;//将temp值放到调整后的位置
     }
}
