package day02;

/*
2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 */
public class Demo05
{
    public static void main(String[] args)
    {
        int n,t,number = 20;
         float a = 2,b =1;
         float s = 0;
         for (n = 1;n <= number; n++)
         {
             s = s + a/b;
             t = (int) a;
             a = a+b;
             b = t;
         }
        System.out.println(s);
    }
}
