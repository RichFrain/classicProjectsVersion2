package Arithmetic.Day03.sort.baseSort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BaseSortTest
{
    public static void main(String[] args)
    {
        int arr[] = new int[8000000];
        for (int i = 0; i < 8000000;i++)
        {
            arr[i] = (int)(Math.random()*800000);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format1 = simpleDateFormat.format(date1);
        System.out.println(format1);

        radixSort(arr);

        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format2 = simpleDateFormat2.format(date2);
        System.out.println(format2);
        System.out.println("排序结束!!!!");

    }

    public static void radixSort(int[] arr) {
        //得到数组中的最大数的位数
        int max = arr[0];//假设第一个数就是最大数
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxLength = (max + "").length();//得到的最大数是几位数
        int[][] buket = new int[10][arr.length];//二维数组，表示10个桶，每个桶就是一个一维数组
        int[] buketElementCounts = new int[10];//桶的个数
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digitOfElement = arr[j] / n % 10;
                buket[digitOfElement][buketElementCounts[digitOfElement]] = arr[j];
                buketElementCounts[digitOfElement]++;
            }

            int index = 0;
            for (int k = 0; k < buketElementCounts.length; k++)//按照桶的顺序，将桶的数据放入原来的数组
            {
                if (buketElementCounts[k] != 0) {
                    for (int l = 0; l < buketElementCounts[k]; l++) {
                        arr[index] = buket[k][l];
                        index++;
                    }
                }
                buketElementCounts[k] = 0;
            }
            //System.out.println("第" + i + "轮的排序处是:" + Arrays.toString(arr));
        }
    }
}