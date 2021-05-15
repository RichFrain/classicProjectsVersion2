package Arithmetic.Day03.sort.quickSort;

import java.util.Arrays;

public class QuickSortVersion1
{
    public static void main(String[] args)
    {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        quickSort(arr,0,arr.length - 1);
        System.out.println("排序后:"+ Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int low,int high)
    {
        if (low < high)
        {
            int index = getIndex(arr,low,high);//找基准数据的正确索引
            quickSort(arr,0,index - 1);
            quickSort(arr,index + 1,high);
        }
    }

    public static int getIndex(int[] arr,int low,int high)
    {
        int temp = arr[low];
        while (low < high)
        {
            while (low < high && arr[high] >= temp)
            {
                high --;
            }

            arr[low] = arr[high];
            while (low < high && arr[low] <= temp)
            {
                low++;
            }
            arr[high] = arr[low];
        }
       arr[low] = temp;
        return low;//返回正确的位置
    }
}
