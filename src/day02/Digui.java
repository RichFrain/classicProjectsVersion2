package day02;

public class Digui
{
    public static  long fun(int num)
    {
        long result;
        if (num >1)
        {
            result =  num *  fun(num - 1);
        }
        else
            result =  1;
        return result;
    }


    public static void main(String[] args)
    {
        System.out.println(fun(20));
    }


}
