package day01;

public class Shuixianhuashu
{
    public static void main(String[] args)
    {
       int i,j,k,n;
        System.out.println("输出100-999所有的水仙花数");
        for (n= 100; n <=999 ; n++)
        {
            i = n/100;
            j = n/10%10;
            k = n%10;
            if (n == (i*i*i+j*j*j+k*k*k))
            {
                System.out.println(n);
            }
        }
    }
}
