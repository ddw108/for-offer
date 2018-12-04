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

        //ListNode
        // 就像你在纸上计算两个数字的和那样，我们首先从最低有效位也就是列表 l1 和 l2 的表头开始相加。
        // 由于每位数字都应当处于 0…9 的范围内，我们计算两个数字的和时可能会出现“溢出”。
        // 例如，5 + 7 = 12。在这种情况下，我们会将当前位的数值设置为 2，并将进位 carry = 1 带入下一次迭代。
        // 进位 carry 必定是 0 或 1，这是因为两个数字相加（考虑到进位）可能出现的最大和为 9 + 9 + 1 = 19。
        // 用 / 和 % 表示比用一个boolean更便捷，注意链表的结构
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