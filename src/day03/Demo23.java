package day03;

public class Demo23
{
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        int temp;
        arr[0] = 22;
        arr[1] = 44;
        arr[2] = 55;
        arr[3] = 33;
        arr[4] = 11;
        System.out.println("原始:");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < 2; i++)
        {
            temp = arr[i];
            arr[i] = arr[5-i-1];
            arr[5-i-1] = temp;
        }
        System.out.println("逆序后:");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(arr[i]);
        }

    }
}
