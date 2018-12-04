/**
 * \$Id: AddTwoNumbers.java,v 1.0 2018/12/3 11:42 dengdingwen
 *
 * @Copyright (c) 2018/12/3, Lianjia Group All Rights Reserved.
 */
package leetcode;

import linkedlist.ListNode;

/**
 * 类注释，描述
 *
 * @author dengdingwwen
 * @version $Id: AddTwoNumbers.java,v 1.0 2018/12/3 11:42 dengdingwwen
 * @date 2018/12/3 11:42
 */
public class AddTwoNumbers {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ListNode p = l1, q = l2, curr = head;
            int plus = 0;
            while (p != null || q != null) {
                int x = p != null ? p.val : 0;
                int y = q != null ? q.val : 0;
                int sum = x + y + plus;
                plus = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (p != null) {
                    p = p.next;
                }
                if (q != null) {
                    q = q.next;
                }
            }
            if (plus > 0) {
                curr.next = new ListNode(plus);
            }
            return head.next;
        }
    }
}