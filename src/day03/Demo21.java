package day03;

import java.util.Scanner;

public class Demo21
{
    public static void main(String[] args)
    {
        int a,n;
        int count = 1;
        long sn = 0, tn = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字a及项数n的值:");
        a = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println("a="+a+",n="+n);
        while (count <= n)
        {
             tn  = tn + a;
             sn = sn  + tn;
             a = a * 10;
             ++ count;
        }
        System.out.println(sn);
        scanner.close();
    }
}
