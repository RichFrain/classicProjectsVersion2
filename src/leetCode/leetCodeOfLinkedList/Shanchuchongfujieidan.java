package leetCode.leetCodeOfLinkedList;

import java.util.List;

/**
 * 从有序链表中删除重复节点
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class Shanchuchongfujieidan
{
    public static void main(String[] args)
    {

    }
     /**
    public static ListNode deleteDuplicates(ListNode head)
    {
        //默认头结点就是首节点
        if (head == null || head.next == null)
        {
            return head;
        }
        ListNode node = head;//node临时变量用于遍历整个链表
        while (node.next != null)
        {
            if (node.val == node.next.val)
            {
                ListNode tmp = node.next;
                node.next  =  node.next.next;

            }
            else
            {
                node = node.next;
            }
        }
       return node;
    }
  */


}
