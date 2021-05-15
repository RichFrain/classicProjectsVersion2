package day01;

import java.util.Scanner;

public class Fenjiezhiyinshu
{
    public static void main(String[] args)
    {
         int n,i;
        System.out.println("请输入一个数:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n);
        for (i = 2;i<= n;i++)
        {
            while (n != i)
            {
                if (n % i == 0)
                {
                    System.out.println(i);
                    n = n /i;
                }
                else
                    break;
            }
        }
        System.out.println(n);

    }
}
