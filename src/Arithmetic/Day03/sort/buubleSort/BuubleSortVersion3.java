package Arithmetic.Day03.sort.buubleSort;

import java.util.Arrays;

public class BuubleSortVersion3
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        System.out.print("排序前:");
        System.out.println(Arrays.toString(arr));
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
            System.out.print("第"+i+"次排序:");
            System.out.println(Arrays.toString(arr));
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
