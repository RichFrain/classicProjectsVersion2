package Arithmetic.Day03.sort.mergeSort;

import java.util.Arrays;

/**
 *
 数组的初始化方式:

 动态初始化 : 初始化时只指定数组长度，由系统为数组分配初始值。
 格式：数据类型[] 数组名 = new 数据类型[数组长度];
 数组长度其实就是数组中元素的个数。
 int[] arr = new int[3];
 解释：定义了一个int类型的数组，这个数组中可以存放3个int类型的值。

 静态初始化:初始化时指定每个数组元素的初始值，由系统决定数组长度
 格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...};
 int[] arr = {1,2,3};
 解释：定义了一个int类型的数组，并且存进去{1，2，3}三个数。
 */
public class MergeSortVersion1
{
    public static void main(String[] args)
    {
        int[] arr = {8,4,5,7,1,3,6,2};
        int[] temp = new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
        System.out.print("归并排序后:");
        System.out.println(Arrays.toString(arr));

    }
    //分的方法
    public static void mergeSort(int[] arr,int left,int right,int[] temp)
    {
        if (left < right)
        {
            int mid = (left + right)/2;//中间的索引
            mergeSort(arr,left,mid,temp);//向左递归进行分解
            mergeSort(arr,mid + 1,right,temp);//向右递归进行分解
            //合并
            merge(arr,left,mid,right,temp);
        }
    }


    //合并的方法
    /**
     *
     * @param arr 排序的原始数组
     * @param left 左边有序序列的初试索引
     * @param mid  中间索引
     * @param right 右边索引
     * @param temp 做中转的数组
     */
    public static void merge(int[] arr,int left,int mid,int right,int[] temp)
    {
        int i= left;//初始化i,左边有序序列的初始索引
        int j = mid +1;//初始化j,右边有序序列的初始索引
        int t = 0;//指向temp数组的当前索引

        /*
           第一步
           1. 先把左右两边(有序)的数据按照规则填充到temp数组
           2. 直到左右两边的有序序列，有一边处理完毕为之
         */
        while (i <= mid && j <= right)
            //如果左边的有序序列的当前元素，小于等于右边有序序列的当前元素
            //即将左边的当前元素，填充到 temp 数组
            //然后t++,i++
            if (arr[i] <= arr[j])
            {
                temp[t] = arr[i];
                t++;
                i++;
            }
            else //反之，将右边的有序序列的当前元素，填充到temp数组
             {
               temp[t] = arr[j];
               t++;
               j++;
             }
            /*
              第二步
              把剩余数据的一边的数据的全部填充到temp
             */
            while (i <= mid)//左边的有序序列还有剩余元素，就全部填充到temp
            {
                temp[t] = arr[i];
                t++;
                i++;
            }
            while (j <= right)//右边的有序序列还有剩余的元素，就全部填充到temp
            {
                temp[t] = arr[j];
                t++;
                j++;
            }
            /*
              第三部
              将temp数组元素拷贝到arr
              注意，并不是每次都拷贝所有
             */
            t = 0;
            int tempLeft = left;
            //第一次合并 tempLeft = 0,right = 1;
            // tempLeft = 2, right = 3
            //最后一次 tempLeft=0,right = 7;
        System.out.println("tempLeft="+tempLeft+"right"+right);
            while (tempLeft <= right)
            {
              arr[tempLeft] = temp[t];
              t++;
              tempLeft++;
            }



    }
}
