package Arithmetic.Day03.sort.selectSort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SelectSortVersionTest
{
    public static void main(String[] args)
    {
        int arr[] = new int[80000];
        for (int i = 0; i < 80000; i++)
        {
           arr[i] = (int)(Math.random()*800000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = simpleDateFormat.format(date1);
        System.out.println(format1);

        selectSort(arr);

        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format2 = simpleDateFormat2.format(date2);
        System.out.println(format2);
        System.out.println("排序结束!!!!");
    }

    public static void selectSort(int[] arr)
    {
        int minIndex;
        int min;
        for (int i = 0;i < arr.length-1;i++)
        {
            minIndex = i;
            min = arr[i];
            for (int j = i+1;j < arr.length;j++)
            {
                if (arr[i] > arr[j])
                {
                    minIndex = j;
                    min = arr[j];
                }
            }
            if (minIndex != i)
            {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
