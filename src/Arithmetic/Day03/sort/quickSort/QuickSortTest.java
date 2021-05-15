package Arithmetic.Day03.sort.quickSort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuickSortTest
{
    public static void main(String[] args)
    {

        int arr[] = new int[800];
        for (int i = 0; i < 800;i++)
        {
            arr[i] = (int)(Math.random()*800000);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format1 = simpleDateFormat.format(date1);
        System.out.println(format1);

        quickSort(arr,0,arr.length - 1);

        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format2 = simpleDateFormat2.format(date2);
        System.out.println(format2);
        System.out.println("排序结束!!!!");

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
