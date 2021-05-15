package Arithmetic.Day03.sort.insertSort;

import java.util.Arrays;

public class InsertSortVersion2
{
    public static void main(String[] args)
    {
        int[] arr = {101,34,100,1};
        insertSort(arr);
        System.out.println("排序完成");

    }

    public static void insertSort(int[] arr)
    {
        int insertVal = 0;
        int insertIndex = 0;

        for (int i = 1;i < arr.length;i++)
        {
            //定义待插的数
            insertVal = arr[i];
            insertIndex = i - 1;//即arr[1]的前面这个数的下标
            while (insertIndex >= 0 && insertVal > arr[insertIndex])
            {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertVal;
            System.out.print("第"+i+"轮从大到小的排序");
            System.out.println(Arrays.toString(arr));

        }
    }

}
