package day01;

public class Feibonaqishulie
{
    public static void main(String[] args)
    {
        long f1,f2;
        f1=f2 = 1;
        System.out.println("输出斐波那契数列20项数据如下:");
        for (int i = 1; i <= 20; i++)
        {
            System.out.print(f1);
            System.out.print(f2);
            if (i % 2 == 0)
            {
                f1 = f1 + f2;
                f2 = f1 + f2;
                System.out.println();
            }
        }
    }
}
