package leetCode.leetCodeOfShuangzhizhen;

import java.util.Scanner;

/**
 * 问题描述: 判断一个非负整数是否为两个整数的平方和
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 */
public class Liangshupingfanghe
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(judgeSquareSum(number));
        scanner.close();

    }

    /*
    可以看成是在元素为 0~target 的有序数组中查找两个数，
    使得这两个数的平方和为 target，
    如果能找到，则返回 true，表示 target 是两个整数的平方和。
     */
    public static boolean judgeSquareSum(int target)
    {
      if (target < 0)
      {
          return false;
      }
      int i = 0;
      int j = (int)Math.sqrt(target);
      while ( i < j)
      {
          int powSum = i*i + j*j;
          if (powSum == target)
          {
              return true;
          }
          else if (powSum > target)
          {
              j--;
          }
          else
          {
              i++;
          }
      }
        return false;
    }
}
