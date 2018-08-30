package linkedlist;

public class FindKthToTail {

    public ListNode FindKthToTail(ListNode head,int k){
        if(head == null)
            return null;
        ListNode h1 = head;
        ListNode h2 = head;
        int i = 0;
        while (h1!=null && i!=k){
            h1 = h1.next;
            i++;
        }
        if(i!=k)
            return null;
        while (h1!=null){
            h1 = h1.next;
            h2 = h2.next;
        }
        return h2;
    }
}
