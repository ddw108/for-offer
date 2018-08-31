package linkedlist;

public class ReverseList {

    public ListNode ReverseList(ListNode head) {
        ListNode lst = null;
        while (head != null) {
            ListNode tmp = head;
            head = head.next;
            tmp.next = lst;
            lst = tmp;
        }
        return lst;
    }
}
