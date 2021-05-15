package Arithmetic.Day03.sort.baseSort;

import java.util.Arrays;

public class BaseSortVersion1
{
    public static void main(String[] args)
    {
        int[] arr = {53,3,542,748,14,214};
        radixSort(arr);

    }

    public static void radixSort(int[] arr)
    {
        /*
          第一步
          得到数组中最大的数的位数
         */
        int max = arr[0];//假设第一个数就是最大的数
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //得到最大的数是几位数
        int maxLength = (max + "").length();
        //定义一个二维数组，表示10个桶，每个桶就是一个二维数组
        /*
          1.二维数组包含10个一维数组
          2. 为了防止在入数的时候数据溢出，则每一个一维数组(桶),大小定为 arr.length
          3. 基数排序是使用空间换时间的经典算法
         */
        int[][] buket = new int[10][arr.length];
        //为了记录每个桶中，实际存放了多少个数据，我们定义一个一维数组来记录各个桶的每次放入的数据的个数
        int[] buketElementCounts = new int[10];//buketElementCounts[0]，记录的就是 buket[0] 桶放入的数据个数

        /*
        第一轮(针对每个元素的个位进行排序处理)
         */
        for (int j = 0; j < arr.length; j++)
        {
            int digitOfElement = arr[j] / 1 % 10;
            //放入对应的桶中
            buket[digitOfElement][buketElementCounts[digitOfElement]] = arr[j];
            buketElementCounts[digitOfElement]++;
        }
        //按照这个桶的顺序(一维数组的下标一次取出数据，放入原来数组)
        int index = 0;
        for (int k = 0; k < buketElementCounts.length; k++)
        {
            if (buketElementCounts[k] != 0)//如果桶中有数据，放入原数组
            {
                for (int l = 0;l < buketElementCounts[k];l++)//循环该桶，即该第k个桶(即第k个一维数组),放入
                {
                   arr[index] = buket[k][l];
                   index++;
                }
            }
            //第一轮处理后，需要将每个 buketElement[k] = 0;
            buketElementCounts[k] = 0;
        }
        System.out.println("第一轮，对个位排序处理arr="+ Arrays.toString(arr));

        //第二轮(针对每个元素的十位进行排序处理)
        for (int j = 0;j < arr.length;j++)
        {
            int digitOfElement = arr[j] / 10 %10;//748 / 10 =74 % 10 =4;取出每个元素的十位的值
            //放入对应的桶中
            buket[digitOfElement][buketElementCounts[digitOfElement]] = arr[j];
            buketElementCounts[digitOfElement] ++;
        }
        //按照这个桶的顺序(一维数组的下标依次取出数据，放入原来的数组)
        index = 0;
        for (int k =0; k < buketElementCounts.length;k++)
        {
            if (buketElementCounts[k] != 0)//如果桶中有数据，才放入原来数组
            {
                for (int l = 0;l < buketElementCounts[k];l++)
                {
                    arr[index] = buket[k][l];
                    index++;
                }
            }
            //第二轮处理后，需要将每个 buketElement[k] = 0;
            buketElementCounts[k] = 0;
        }
        System.out.println("第二轮,对十位排序处理是arr:"+Arrays.toString(arr));

        //第三轮(针对每个元素的百位进行排序处理
        for(int j = 0;j < arr.length;j++)//取出每个元素的百位进行排序处理
        {
            int digitOfElemmet = arr[j] / 100 % 10;
            buket[digitOfElemmet][buketElementCounts[digitOfElemmet]] = arr[j];
            buketElementCounts[digitOfElemmet]++;
        }
        //按照这个桶的排序(一维数组的下标一次取出数据，放入原来数组)
        index = 0;
        for (int k = 0; k < buketElementCounts.length;k++)//遍历每一个桶，并将桶中的数据放入原来的数组
        {
            if (buketElementCounts[k] != 0)//如果桶中有数据
            {
                for (int l = 0; l<buketElementCounts[k];l++)
                {
                    arr[index] = buket[k][l];
                    index++;
                }
            }
           buketElementCounts[k] = 0;
        }
        System.out.println("第三轮,对十位排序处理是arr:"+Arrays.toString(arr));
    }
}
