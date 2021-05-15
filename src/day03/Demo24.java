package day03;

import java.util.Scanner;

public class Demo24
{
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        int temp1, temp2, number, end;
        System.out.println("原始数组如下:");
        for (int i = 0; i < 5; i++)
        {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
        System.out.println("请输入要插入的数字:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        end = arr[4];
        if (number > end)
        {
           arr[5] = number;
        }
        else
        {
            for (int i = 0; i < 4; i++)
            {
              if (number < arr[i])
              {
                  temp1 = arr[i];
                  arr[i] = number;
                  for (int j = i+1; j < 5; j++)
                  {
                      temp2 = arr[j];
                      arr[j] = temp1;
                      temp1 = temp2;
                  }
                  break;
              }
            }
        }
        scanner.close();
        for (int i = 0; i < 5; i++)
        {
            System.out.printf("%d\t",arr[i]);
        }
    }
}
