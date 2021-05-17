package Arithmetic.Day03.sort.heapSort;

import java.util.Arrays;

public class HeapSortVersion2
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
        //1 将无序序列构建成一个堆，根据升序降序需求选择大顶堆或小顶堆
        for (int i = arr.length/2 - 1; i >= 0;i--)
        {
            adjustHeap(arr,i,arr.length);
        }
        //2 将堆顶元素与末尾元素交换，将最大元素"沉" 到数组末端，
        //之后重新调整结构，使其满足堆的定义，然后继续交换堆顶元素与当前末尾元素，
        //反复执行调整+交换，直到整个序列有序
        for (int j = arr.length-1;j > 0;j--)
        {
            temp = arr[j];
            arr[j] = arr[0];//调整过后arr[0]是最大值了(大顶堆)
            arr[0] = temp;
            adjustHeap(arr,0,j);
            System.out.println("数组"+ Arrays.toString(arr));
        }
    }

    /**
     * 功能: 完成将以 i 为对应的非叶子节点的树调整成大顶堆
     * 举例 int[] arr = {4,6,8,5,9} i=1, 通过adjustHeap 得到 {4,9,8,5,6}
     * 如果再次调用 adjustHeap 传入的是 i=0，得到{4,9,8,5,6} => {9,6,8,5,4}
     * @param arr 待调整的数组
     * @param i  表示非叶子节点在数组中的索引
     * @param length 表示对少个元素继续调整，length 是在逐渐的减少
     */
    public static void adjustHeap(int[] arr,int i,int length)
    {
        int temp = arr[i];
        //k = i * 2 + 1; k 是i节点的左子节点
        for (int k = i * 2;k < length;k = k *2 +1)
        {
            if (k+1 < length && arr[k] < arr[k+1])//说明左子节点的值小于右子节点的值
            {
                k++;//k指向右子节点
            }
            if (arr[k] > temp)//如果子节点大于父节点
            {
                arr[i] = arr[k];//把较大的值赋给当前节点
                i = k;//i 继续指向k,k继续循环比较
            }
            else
            {
                break;
            }
        }
        arr[i] = temp;//将temp的值放到调整后的位置
    }
}
