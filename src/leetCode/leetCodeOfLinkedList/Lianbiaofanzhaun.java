package leetCode.leetCodeOfLinkedList;

/**
 *链表反转
 */
public class Lianbiaofanzhaun
{
    public static void main(String[] args)
    {

    }

    /*
      方法1   头插法
     */
    /**
    public static ListNode reverseList(ListNode head)
    {
        ListNode prev = null, next = null;
        ListNode curr = head;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
     */
    /**
    public ListNode reverseList(ListNode head)
    {
        if (head == null)
        {
            return null;
        }
        // 当前节点是head pre为当前节点的前一节点，next为当前节点的下一节点
        // 需要pre和next 的目的是让当前节点 pre->head->next1->next2 变成 pre<-head, next1->next2
        //即pre让节点可以反转所指方向，但反转之后如果不用next节点保存 next1节点的话，单链表就断开了
        //所以需要用到pre 和 next两个节点
        //1->2->3->4->5
        //1-<2-<3-<4-<5
        ListNode pre = null;
        ListNode next = null;
        //做循环，如果当前节点不为空的话，始终执行此循环，此循环的目的就是让当前节点从指向next到指向pre
        //如此就可以做到反转链表的效果
        while (head != null)
        {
            //先用next保存head的下一节点的信息，保证单链表不会因此失去head节点的原next节点而就此断链
            next = head.next;
          //保存完next,就可以让head从指向next变成指向pre了
          head.next = pre;
          //head指向pre后，就依次反转下一个节点
            pre = head;
            //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
            head = next;
        }
        return pre;
    }
    */

     /*
       1.创建一个带头节点的链表head
       2. 定义一个循环链表变量 p,p的初始值为待反转的链表
       3. 遍历待反转的链表，遍历条件为(p != null)
          3.1 把p当前指向的首节点和
    */
     /*
        方法2 递归
      */


}
