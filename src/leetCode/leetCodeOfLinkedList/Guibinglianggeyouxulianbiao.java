package leetCode.leetCodeOfLinkedList;

import java.util.List;

/**
 *  归并两个有序的链表
 */
public class Guibinglianggeyouxulianbiao
{
    public static void main(String[] args)
    {

    }
    /*
       方法1 递归
       从两个输入链表的头结点 l1 l2开始进行比较，将节点值较小的设为头结点，
       递归调用自身计算l2和l1.next(或l1 和 l2.next)的合并，使头结点指向合并后的链表头
     */
    /**
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val)
        {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else
            {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
            }
    }
     */
        /*
          方法2
          新建一个链表newHead,不断的比较输入的两个有序链表中的最小值，
          不断以最小值建立新节点，插入到新链表newHead上
         */

        /*
          方法3
           设置一个pre指针，指向一个新建的节点，它是我们找到输出结果的关键
           接下来设立一个end指针，指向我们结果链表(pre)的最后一个元素，用来从两条输入的链表串联
           新的元素
           然后，遍历两个链表，每次找到较小的节点，将该节点插入结果链表(pre)，插入的方法是
           把节点接到end指针后面
           最后需要更新输入链表的头指针和 end指针
         */
        /**
       public static ListNode mergeTwoLists(ListNode l1,ListNode l2)
       {
           if (l1 == null)
           {
               return l2;
           }
           if (l2 == null)
           {
               return l1;
           }
           ListNode pre = new ListNode(-1);
           ListNode end = new ListNode();
           end = pre;
           while (l1 != null && l2 != null)
           {
               if (l1.val > l2.val)
               {
                  end.next = l2;
                  end = l2;
                  l2  = l2.next;
               }
               else
               {
                  end.next = l1;
                  end = l1;
                  l1 = l1.next;
               }
           }
              if (l1 == null)
              {
                  end.next == l2;
              }
              else
              {
                  end.next = l1;
              }
              return pre.next;
       }
         */
       /*
         方法4
         因为两个链表都是有序链表（递增），因此可以很容易地找出两个链表中的最小元素，
         即比较两个链表表头的元素，时间复杂度是 O(1) 的。
         我们可以利用两个指针——指向两个链表的最小节点，
         每次比较两个指针所指向节点的值，将值比较小的节点加到新的链表中，
         然后更新指针，如此循环往复直到到达一个链表的尾部。
         最后，还需要将另一个链表的剩余部分（如果存在的话）添加到新的链表的尾部。
        */

       /**
       public ListNode mergeTwoLists(ListNode l1,ListNode l2)
       {
           ListNode dummyHead = new ListNode(0);//初始化一个节点值为0的空节点
           ListNode lastNode = dummyHead;
           while (l1 != null && l2 != null)
           {
               if (l1.val < l2.val)
               {
                   lastNode.next = l1;
                   //l1 = lastNode;
                   l1 = l1.next;
               }
               else
               {
                   lastNode.next = l2;
                   //l2 = lastNode;
                   l2 = l2.next;
               }
               lastNode = lastNode.next;
           }
           //lastNode.next = l1 != null ? l1 : l2; 与下面两个if等价
               if (l1 != null)
               {
                   lastNode.next= l1;
                   //l1 = lastNode;

               }
               if (l2 != null)
               {
                   lastNode.next = l2;
                   //l2 = lastNode;
               }
               return dummyHead.next;
       }
       */
}
