package Arithmetic.Day03.sort.selectSort;

import java.util.Arrays;

public class SelectSortVersion1
{
    public static void main(String[] args)
    {
          int arr[] = {101,34,119,1};

          /*
            第一轮
           */
          int minIndex = 0;
          int min = arr[0];//假定arr[0] 为最小值
          for (int j = 0+1; j < arr.length;j++)//三次比较
          {
              if (min > arr[j])//说明假定的最小值，并不是最小
              {
                  min = arr[j];//重置min
                  minIndex = j;//重置minIndex
              }
          }
          //将最小值，放在arr[0]，即交换
        if (minIndex != 0)
        {
            arr[minIndex] = arr[0];
            arr[0] = min;
        }
        System.out.print("第一轮后:");
        System.out.println(Arrays.toString(arr));

        //第二轮
        minIndex = 1;
        min = arr[1];//假定arr[1]为最小值
        for (int j = 1+1;j<arr.length;j++)//两次比较
        {
            if (min > arr[j])//说明假定的最小值，并不是最小
            {
                min = arr[j];//重置min
                minIndex = j;//重置minIndex
            }
        }
        //将最小值,放在arr[0]，即交换
        if (minIndex != 1)
        {
            arr[minIndex] = arr[1];//重置minIndex
            arr[1] = min;//重置min
        }
        System.out.print("第二轮后:");
        System.out.println(Arrays.toString(arr));

        //第三轮
        minIndex = 2;
        min = arr[2];//假定最小值为arr[2]
        for (int j = 2+1;j < arr.length;j++)//一次比较
        {
            if (min > arr[j])
            {
                min = arr[j];//重置min
                minIndex = j;//重置minIndex
            }
        }
        if (minIndex != 2)
        {
            arr[minIndex] = arr[2];
            arr[2] = min;
        }
        System.out.print("第三轮后:");
        System.out.println(Arrays.toString(arr));
    }
}
