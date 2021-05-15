package leetCode.leetCodeOfShuangzhizhen;

/**
 * 判断链表是否存在环
 */
public class Panduanlainbiaoshifouyouhuan
{
    public static void main(String[] args)
    {

    }

    /*
      使用双指针，一个指针每次移动一个节点，
      一个指针每次移动两个节点，如果存在环，那么这两个指针一定会相遇。
      由于fast要比slow移动的快，如果有环，
      fast一定会先进入环，而slow后进入环。
      当两个指针都进入环之后，经过一定步的操作之后
      二者一定能够在环上相遇，并且此时slow还没有绕环一圈，
      也就是说一定是在slow走完第一圈之前相遇。
     */
    /**
    public boolean hasCycle(ListNode head)
    {
        if (head == null)
        {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head.next;
        while ( fast != null &&  slow != null & fast.next != null)
        {
            if (fast == slow)
            {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
      return false;

    }
     **/
}
