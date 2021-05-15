package Arithmetic.Day03.sort.insertSort;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertSortVersion1
{
    public static void main(String[] args)
    {
       int[] arr = {101,34,100,1};

       //第一轮
       int insertVal = arr[1]; //定义带插入的数
       int insertIndex = 1 - 1;//即arr[1]的前面这个数的下标

        /*
        给insertVal 找到插入的位置
        1. insertIndex >= 0 保证在给insertVal 找到插入位置，不越界
        2. insertVal < arr[insertIndex] 待插入的数，还没找到插入位置
        3. 就需要将 arr[insertIndex] 后移
         */
        while (insertIndex  >= 0 && insertVal < arr[insertIndex])
        {
            arr[insertIndex + 1] = arr[insertIndex];// arr[0]往后移了一下 {101,34,100,1} => {101,101,100,1}
            insertIndex--;
        }
        //当退出while循环时，说明插入的位置找到，insertIndex + 1
        arr[insertIndex+1] = insertVal;
        System.out.print("第1轮插入");
        System.out.println(Arrays.toString(arr));

        //第二轮
        insertVal = arr[2];
        insertIndex = 2 - 1;
        while (insertIndex >= 0 && insertVal < arr[insertIndex])
        {
            arr[insertIndex+1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertVal;
        System.out.print("第2轮插入");
        System.out.println(Arrays.toString(arr));

        //第3轮
        insertVal = arr[3];
        insertIndex = 3 - 1;
        while (insertIndex >= 0 && insertVal < arr[insertIndex])
        {
            arr[insertIndex + 1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertVal;
        System.out.print("第3轮插入");
        System.out.println(Arrays.toString(arr));

    }



}
