package leetCode.leetCodeOfLinkedList;
/**
 * 删除链表的倒数第n个节点
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class Shanchuliaobiaodedaoshudingejiedian
{
    public static void main(String[] args)
    {

    }
     /*
      方法1
      */
     /**
    public static ListNode removeNthFormEnd(ListNode head,int n)
    {
        ListNode fast = head;
        while (n > 0)
        {
            fast = fast.next;
            n--;
        }
        if (fast == null)
        {
            return head.next;
        }
        ListNode solw = head;
        while (fast.next != null)
        {
            fast = fast.next;
            solw = solw.next;
        }
        solw.next = solw.next.next;
        return head;
    }*/


    /*
       方法2
      让我们删除倒数第N个元素，那我们只要找到倒数第N个元素就可以了，
      那怎么找呢？我们只需要设置两个指针变量，中间间隔N-1元素。
      当后面的指针遍历完所有元素指向nil时，前面的指针就指向了我们要删除的元素。
     */

    /**
    public static ListNode removeNthFromEnd(ListNode head,int n)
    {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode pre = null;
        ListNode cur = result;
        int i = 1;
        while (head != null)
        {
            if (i >= n)
            {
                pre = cur;
                cur = cur.next;
            }
            head = head.next;
            i++;
        }
        pre.next = pre.next.next;
        return result.next;
    }
     */
}
