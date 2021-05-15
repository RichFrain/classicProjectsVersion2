package Arithmetic.Day03.sort.selectSort;

import java.util.Arrays;

public class SelectSortVersion3
{
    public static void main(String[] args)
    {
        int arr[] = {101, 34, 119, 1};
        selectSort(arr);

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
            System.out.print("第"+i+"次排序");
            System.out.println(Arrays.toString(arr));
        }
    }
}
