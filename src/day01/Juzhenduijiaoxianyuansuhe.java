package day01;

import java.util.Scanner;

public class Juzhenduijiaoxianyuansuhe
{
    public static void main(String[] args)
    {
        int a[][] =new int[3][3];
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入矩阵元素值(3*3):");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                 a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++)
        {
          sum = sum + a[i][i];
        }
        System.out.println("矩阵对角线(3*3)元素之和为:"+sum);
    }
}
