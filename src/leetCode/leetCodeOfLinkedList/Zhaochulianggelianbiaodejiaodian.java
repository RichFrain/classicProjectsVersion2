package leetCode.leetCodeOfLinkedList;
/**
 * 找出两个链表的交点
 * A:          a1 → a2
 *                     ↘
 *                       c1 → c2 → c3
 *                     ↗
 * B:    b1 → b2 → b3
 *
 * 但是不会出现以下相交的情况，因为每个节点只有一个 next 指针，
 * 也就只能有一个后继节点，而以下示例中节点 c 有两个后继节点。
 * A:          a1 → a2       d1 → d2
 *                     ↘  ↗
 *                       c
 *                     ↗  ↘
 * B:    b1 → b2 → b3        e1 → e2
 */
public class Zhaochulianggelianbiaodejiaodian
{
    public static void main(String[] args)
    {

    }
    /*
      方法1  暴力破解法  时间复杂度为 O(n^2)
      思路：有2个链表，所以我们可以使用双重循环，先遍历第一个链表，
      在遍历第一个链表的同时里面嵌套遍历第二个链表。
     */
    /**
    public static ListNode getInterNode1(ListNode headA,ListNode headB)
    {
     //说明 ：head -> 1 -> 2 -> 3 -> 4 -> 5 -> 6  head叫做链表的头结点，1所在的节点叫做链表的首节点
     //但是，在一些编程题里，有可能把头节点默认为首节点。也就是说head不仅指向1，而且head.val=1，那head.next.val=2。
     //即head就是1的节点，head的下一个节点是2的节点。那么这个链表一个就有6个节点（head和1所在的节点看作一个节点）。
     //因此，若定义一个Listnode cur = head；则cur.val = 1
     //但有时我们需要定义一个辅助节点
     //ListNode now = new ListNode(-1);
     //now.next = head
     //这表示定义一个节点now，它没有值，它指向头节点head

        ListNode l1 = headA, l2 = headB;
        while (l1 != null)
        {
            while (l2 != null)
            {
                if (l1 == l2)
                {
                    return l1;
                }
                l2 = l2.next;
            }
            l2 = headB;//第二个链表会多次遍历，所以遍历完一次后需要将指针放到第一个节点上
            l1 = l1.next;
        }
        return null;
    }
    */

    /*
     方法2： 双指针法  时间复杂度为 O(N)，空间复杂度为 O(1)。
    设 A 的长度为 a + c，B 的长度为 b + c，其中 c 为尾部公共部分长度，
    可知 a + c + b = b + c + a。
     当访问到A链表的指针访问到链表尾部时，令它从链表B的头部开始访问链表B，
     同样的，当访问B链表的指针访问到链表尾部时，令它从链表A的头部开始访问链表A，
     这样就能控制访问A和B 两个链表的指针能同时访问到交点
      p走：a1 -> a2 -> c1 -> c2 -> c3 -> b1 -> b2 -> b3 -> c1 -> c2 -> c3
      q走：b1 -> b2 -> b3 -> c1 -> c2 -> c3 -> a1 -> a2 -> c1 -> c2 -> c3
     */

    /**
    public ListNode getInterNode(ListNode headA,  ListNode headB)
    {
        ListNode l1 = headA, l2 = headB;
        while (l1 != l2)
        {
          if (l1 == null)//为什么不是 l1.next == null,因为存在两种情况 1，一个为空，一个不为空。2，两个链表没有重合

          {
              l1 = headB;
          }
          else
          {
              l1 = l1.next;
          }
          if (l2 == null)//同理
          {
              l2 = headA;
          }
          else
          {
              l2 = l2.next;
          }
        }
        return l1;
    }
     */
}
