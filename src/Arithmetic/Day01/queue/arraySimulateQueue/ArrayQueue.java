package Arithmetic.Day01.queue.arraySimulateQueue;

public class ArrayQueue
{
    private int maxSize;//表示数组的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//模拟队列

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize)
    {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;//指向队头的前一个位置
        rear = -1;//指向队尾
    }

    //判断队列是否满
    public boolean isFull()
    {
        return rear == maxSize - 1;
    }

    //判断队列是否为空
    public boolean isEmpty()
    {
        return rear == front;
    }

    //添加数据到队列,入队
    public void addQueue(int number)
    {
        if (isFull())
        {
            System.out.println("队列满，不能加入数据");
            return;
        }
        rear++;//rear后移
        arr[rear] = number;
    }

    //获取队列的数据，出队列
    public int getQueue()
    {
        if (isEmpty())
        {
            throw new RuntimeException("队列空，不能取数据");
        }
        front++;
        return arr[front];
    }

    //显示队列的所有数据
    public void showAll()
    {
        if (isEmpty())
        {
            System.out.println("队列是空的，没有数据");
            return;
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    //获取队列的队头数据区
    public int headQueue()
    {
        if (isEmpty())
        {
            throw new RuntimeException("队列是空的，没有数据");
        }
        return arr[front+1];
    }
}
