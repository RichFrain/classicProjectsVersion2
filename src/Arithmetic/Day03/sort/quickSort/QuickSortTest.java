package Arithmetic.Day03.sort.quickSort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuickSortTest
{

    public static void main(String[] args)
    {
//        int[] arr = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
//        System.out.println("排序前:");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("排序后");
//        quickSort(arr,0,arr.length - 1);
//        System.out.println(Arrays.toString(arr));

        int arr[] = new int[8000000];
        for (int i = 0; i < 8000000;i++)
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

    private static void quickSort(int[] arr,int low,int high)
    {
        if (low < high)
        {
            // 找寻基准数据的正确索引
            int index = getIndex(arr,low,high);
            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            quickSort(arr,low,index - 1);
            quickSort(arr,index + 1,high);
        }
    }

    private static int getIndex(int[] arr,int low,int high)
    {
        int tmp = arr[low];//基准数据
        while (low < high)
        {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && arr[high] >= tmp)
            {
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            arr[low] = arr[high];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low < high && arr[low] <= tmp )
            {
                low++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            arr[high] = arr[low];
        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        arr[low] = tmp;
        return low;//返回tmp的正确位置
    }
}
