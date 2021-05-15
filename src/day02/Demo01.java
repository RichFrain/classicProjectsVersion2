package day02;

import java.util.Scanner;

public class Demo01
{
    public static void main(String[] args)
    {
        long  i;
        int bonus1, bouns2, bonus4, bonus6, bonus10, bonus;
        System.out.println("请输入利润金额:");
        Scanner sc = new Scanner(System.in);
        i = sc.nextLong();
        bonus1 = (int) (100000*0.1);
        bouns2 = (int) (bonus1 + 100000*0.075);
        bonus4 = (int) (bouns2 + 200000 * 0.05);
        bonus6 = (int) (bonus4 + 200000*0.03);
        bonus10 = (int) (bonus6 + 400000*0.015);
        if (i <= 100000)
            bonus = (int) (i * 0.1);
        else if (i <= 200000)
            bonus = (int) (bonus1 + (i - 100000)*0.075);
        else if (i <= 400000)
            bonus = (int) (bouns2 + (i - 200000)*0.05);
        else if (i <= 600000)
            bonus = (int) (bonus4 + (i - 400000)*0.03);
        else if (i <= 1000000)
            bonus = (int) (bonus6 + (i - 600000)*0.015);
        else
            bonus = (int) (bonus10 + (i - 1000000)*0.01);
        System.out.println(i+"元获得的奖金是"+bonus);
    }
}
