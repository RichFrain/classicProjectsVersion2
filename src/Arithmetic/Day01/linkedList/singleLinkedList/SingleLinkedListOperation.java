package Arithmetic.Day01.linkedList.singleLinkedList;

import java.util.Stack;

/**
 * 定义SingleLinkedListOperation 管理英雄
 */
public class SingleLinkedListOperation
{
    //先初始化一个头结点，头结点不要动，不存放具体的数据
    private HeroNode head = new HeroNode(0, "", "");

    /*
    添加节点到单向链表之不考虑顺序编号时
     */
    public void add(HeroNode heroNode) {
        HeroNode temp = head;//因为head节点不能动，所以需要一个辅助遍历指针 temp
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;//当退出while循环时，temp就到了链表的最后。将最后的节点的next指向新的节点
    }

    /*
    添加节点到单向链表之考虑顺序编号
     */
    public void addByOrder(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null)//说明temp已经在链表的最后
            {
                break;
            }
            if (temp.next.no > heroNode.no)//位置找到，就在temp的后面插入
            {
                break;
            } else if (temp.next.no == heroNode.no)//说明编号存在
            {
                flag = true;
                break;
            }
            temp = temp.next;//指针后移
        }

        if (flag)//不能添加，说明编号存在
        {
            System.out.printf("准备插入的英雄编号%d已经存在,不能加入\n", heroNode.no);
        } else //插入到链表中，temp的后面
        {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }

    }

    /*
    修改节点的信息根据no来修改，即no编号不能改变
     */
    public void update(HeroNode newHeroNode) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false;//表示是否找到该节点
        while (true) {
            if (temp == null) {
                break;//已经遍历完链表
            }
            if (temp.no == newHeroNode.no)//找到
            {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newHeroNode.name;
            temp.nikeName = newHeroNode.nikeName;
        } else {
            System.out.printf("没有找到编号%d的节点,不能修改\n", newHeroNode.no);
        }

    }

    /*
    删除节点
     */
    public void del(int no) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;//指针后移
        }
        if (flag)//可以找到，删除
        {
            //temp.no= temp.next.no;
            temp.next = temp.next.next;//删除某个结点的方法就是更改前一个结点的指针域
        } else {
            System.out.printf("要删除的%d节点不存在\n", no);
        }
    }

    /*
    显示(遍历)链表
     */
    public void list()
    {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
    /*
    链表反转
     */
    public  void reverseLinkedList()
    {
        if (head.next == null || head.next.next == null)
        {
            return;
        }
        HeroNode cur = head.next;//定义一个辅助的指针，帮助我们遍历原来的链表
        HeroNode next = null;//指向当前节点[cur]的下一个节点
        HeroNode reverseHead = new HeroNode(0, "", "");
            while (cur != null)
            {
                next = cur.next;//先暂时保存当前节点的下一节点，因为后面需要使用
                cur.next = reverseHead.next;//
                reverseHead.next = cur;//将cur连接到新的链表上
                cur = next;//让cur后移
            }
           head.next = reverseHead.next;
     }

    /*
      统计节点个数
     */
    public static int getCount(HeroNode head)
    {
        int count =0;
        if (head.next == null)
        {
            return 0;
        }
        HeroNode temp = head.next;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println("节点个数为:"+count);
        return count;

    }

    /**
     * 查找单链表的倒数第K个节点
     */
    public static HeroNode findLastIndexNode(HeroNode head,int index)
    {
        if (head.next == null)
        {
            return null;
        }
        int size = getCount(head);
        if (index <= 0 || index > size)
        {
            return null;
        }
        HeroNode cur = head.next;
        for (int i=0;i < size - index;i++)
        {
            cur = cur.next;
        }
        return cur;
    }

    /*
      链表逆序打印
     */
    public static void reversePrint(HeroNode head)
    {
        if (head.next == null)
        {
            return;
        }
        Stack<HeroNode> stack = new Stack<HeroNode>();//创建一个栈，将各个节点压入栈
        HeroNode cur = head.next;
        while (cur != null)//将链表所有节点压入栈
        {
             stack.push(cur);
             cur = cur.next;
        }
        while (stack.size() > 0)//将栈中的节点pop出栈打印
        {
            System.out.println(stack.pop());
        }
    }
}

