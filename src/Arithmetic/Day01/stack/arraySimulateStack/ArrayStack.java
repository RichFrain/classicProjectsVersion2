package Arithmetic.Day01.stack.arraySimulateStack;

import java.util.Scanner;

public class ArrayStack
{
    public static void main(String[] args)
    {
        ArrayStackOperations arrayStackOperations = new ArrayStackOperations(4);
        String key = "";
        boolean loopp = true;
        Scanner scanner = new Scanner(System.in);
        while (loopp)
        {
            System.out.println("show:表示显示栈");
            System.out.println("exit:退出程序");
            System.out.println("push:入栈");
            System.out.println("pop:出栈");
            System.out.println("请输入你的选择");
            key = scanner.next();
            switch (key)
            {
                case "show":
                    arrayStackOperations.list();
                    break;
                case "push":
                    System.out.println("请输入一个数:");
                    int value = scanner.nextInt();
                    arrayStackOperations.push(value);
                    break;
                case "pop":
                    int res = arrayStackOperations.pop();
                    System.out.printf("出栈的是%d\n",res);
                    break;
                case "exit":
                    scanner.close();
                    loopp = false;
                    break;
                default:
                    break;
            }
        }
    }
}
