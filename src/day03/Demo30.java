package day03;

public class Demo30
{
    public static void main(String[] args)
    {

        /*
           1+2!+3!+4!+....n!
           1+1*2+1*2*3+1*2*3*4+
         */
        int n, s = 0, t =1;
        for ( n = 1; n <= 3; n++)
        {
           t =  t*n;
           s = s + t;
        }
        System.out.printf("1+2!+...+3!=%d\n",s);
    }
}
