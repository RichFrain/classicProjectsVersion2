package leetCode.leetcodeOfViloient;
/**
 * 韩信知道部队人数大约1000人左右，具体数字不详，5人一组剩余1人，
 * 7个人一组还剩两个人，8个人一组还剩3个人，问：这支部队有多少人?
 */
public class Hanxindianbin
{
    public static void main(String[] args)
    {
       for (int i = 0;i < 1500;i++)
       {
           if (i % 5 == 1 && i % 7 == 2  && i % 8 == 3)
           {
               System.out.println(i);
           }
       }
    }
}
