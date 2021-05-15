package Arithmetic.Day01.queue.arraySimulateQueue;

import java.util.Scanner;

/**
 * 数组模拟队列遇到的问题
 * 1. 目前数组只能使用一次，没有打到复用的效果
 * 2. 改进：将这个数组使用算法，改进成一个环形队列 取模 %
 */
public class ArraySimulateQueue
{
    public static void main(String[] args)
    {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key;
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while (loop)
        {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):查看队列头的数据");
            key = scanner.next().charAt(0);
            switch (key)
            {
                case 's':
                    arrayQueue.showAll();
                    break;
                case 'a':
                    System.out.println("输入一个数:");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':
                    try
                    {
                        int res = arrayQueue.getQueue();
                        System.out.printf("队头的数据是:%d\n", res);
                    } catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try
                    {
                        int res = arrayQueue.headQueue();
                        System.out.printf("队头的数据是:%d\n",res);
                    } catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                 default:
                     break;
            }
        }
    }
}
