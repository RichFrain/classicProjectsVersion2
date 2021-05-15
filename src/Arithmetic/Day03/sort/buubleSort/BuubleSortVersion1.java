package Arithmetic.Day03.sort.buubleSort;

import java.util.Arrays;

public class BuubleSortVersion1
{
    public static void main(String[] args)
    {
      int arr[] = {1,20,19,18,-1};
        System.out.print("排序前:");
        System.out.println(Arrays.toString(arr));
        int temp;
        //第一躺排序
        for (int i = 0; i < arr.length -1; i++)//经过4次比较
        {
            if (arr[i] > arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
       //第二趟排序
        for (int i = 0; i < arr.length -1-1; i++)//经过3次比较
        {
            if (arr[i] > arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        //第三趟排序
        for (int i = 0; i < arr.length -1-2; i++)//经过2次比较
        {
            if (arr[i] > arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        //第四趟排序
        for (int i = 0; i < arr.length -1-3; i++)//经过1次比较
        {
            if (arr[i] > arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
