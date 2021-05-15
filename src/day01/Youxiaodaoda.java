package day01;

import java.util.Scanner;

public class Youxiaodaoda
{

    public static void main(String[] args)
    {
           int x,y,z,tmp;
        System.out.println("请输入三个整数:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
       if (x > y)
       {
          tmp = x;
          x =  y;
          y = tmp;
       }
       if (x > z)
       {
           tmp = x;
           x  = z;
           z = tmp;
       }
       if (y > z)
       {
           tmp = y;
           y = z;
           z = tmp;
       }
        System.out.println("从小到大输出结果为:");
        System.out.print(x);
        System.out.print(y);
        System.out.print(z);



    }
}
