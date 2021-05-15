package Arithmetic.Day01.linkedList.DoubleLinkedList;

public class DoubleLinkedListOperation
{
    //初始化一个头结点，头结点不要动，不存放具体的数据
    private HeroNode2 head = new HeroNode2(0,"","");

    /*
     返回头结点
     */
    public HeroNode2 getHead()
    {
        return head;
    }

    /*
    遍历双向链表
     */
    public void list()
    {
        if (head.next == null)
        {
            System.out.println("链表为空");
            return;
        }
        HeroNode2 temp = head.next;//头结点不能动，需要一个辅助指针
        while (true)
        {
            if (temp == null)
            {
                break;
            }
            System.out.println(temp);//输出节点信息
            temp = temp.next;
        }
    }

    /*
      添加一个节点到双向链表的最后
     */
     public void add(HeroNode2 heroNode)
     {
         HeroNode2 temp = head;//辅助指针
         while (true)
         {
             if (temp.next == null)
                 return;
             temp = temp.next;//指针后移
         }
         //当退出while循环时，temp就到了链表最后
//          temp.next = heroNode;
//          heroNode.pre = temp;
     }

     /*
       修改双向链表中一个节点的内容
      */
     public void update(HeroNode2 newHeroNode)
     {
         if (head.next == null)
         {
             System.out.println("链表为空");
             return;
         }
         HeroNode2 temp = head.next;
         while (true)
         {
             if (temp.no == newHeroNode.no)
             {
                 temp.name = newHeroNode.name;
                 temp.nikeName = newHeroNode.nikeName;
             }
             else
             {
                 System.out.printf("没有找到 编号%d的节点不能修改",newHeroNode.no);
             }
             temp = temp.next;
         }
     }
     /*
      从双向链表中删除一个节点
      */
     public void del(int no)
     {
         if (head.next == null)
         {
             System.out.println("链表为空,无法删除");
             return;
         }
         HeroNode2 temp = head.next;//辅助指针
         boolean flag = false;//标志是否找到待删除节点
         while (true)
         {
             if (temp == null)
                 break;
             if (no == temp.no)
             {
                 flag = true;
                 break;
             }
             temp = temp.next;//指针后移
         }
         if (flag)//判断flag
         {
             temp.pre.next = temp.next;
//             temp.next.pre = temp.pre;
         }
         if (temp.next != null)//如果是最后一个节点，就不需要执行这一步，否则会出现空指针异常
         {
             temp.next.pre = temp.pre;
         }
         else
         {
             System.out.printf("要删除的%d节点不存在\n",no);
         }



     }

}
