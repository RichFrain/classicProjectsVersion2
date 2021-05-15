package Arithmetic.Day03.sort.insertSort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class InsertSortVersionTest
{
    public static void main(String[] args)
    {

        int arr[] = new int[80000];
        for (int i = 0; i < 80000;i++)
        {
            arr[i] = (int)(Math.random()*800000);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format1 = simpleDateFormat.format(date1);
        System.out.println(format1);

        insertSort(arr);

        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format2 = simpleDateFormat2.format(date2);
        System.out.println(format2);
        System.out.println("排序结束!!!!");
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
            while (insertIndex >= 0 && insertVal < arr[insertIndex])
            {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertVal;
        }
    }
}
