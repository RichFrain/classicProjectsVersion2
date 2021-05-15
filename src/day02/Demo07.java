package day02;

import java.util.Scanner;

public class Demo07
{
    public static void main(String[] args)
    {
        long ge,shi,bai,qian,wan,x;
        Scanner scanner = new Scanner(System.in);
        x  = scanner.nextLong();
        wan = x/10000;
        qian = x%10000/1000;
        shi = x%100/10;
        ge =x%10;
        if (ge == wan && shi == qian)
        {
            System.out.println(x+"是一个回文数");
        }
        else
        {
            System.out.println(x+"不是一个回文数");
         }

    }
}
