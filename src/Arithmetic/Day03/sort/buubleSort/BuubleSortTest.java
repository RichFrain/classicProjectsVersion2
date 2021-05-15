package Arithmetic.Day03.sort.buubleSort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BuubleSortTest
{
    public static void main(String[] args)
    {
           int arr[] = new int[80000];
        for (int i = 0; i < 80000; i++)
        {
          arr[i] = (int)(Math.random() * 80000000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = simpleDateFormat.format(date1);
        System.out.println(format1);
        buubleSort(arr);
        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format2 = simpleDateFormat2.format(date2);
        System.out.println(format2);
        System.out.println("排序结束!!!!");

    }

    public static void buubleSort(int[] arr)
    {
        int temp ;
        boolean flag = false;//标识变量，表示是否进行过交换
        for (int i = 0; i < arr.length -1;i++)
        {
            for (int j = 0; j < arr.length-1-i;j++)
            {
                if (arr[j] > arr[j+1])
                {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (flag == false)//在一趟排序中，一次交换也没有发生过
            {
                break;
            }
            else
            {
                flag = false;//重置flag,进行下次判断
            }
        }
    }
}
