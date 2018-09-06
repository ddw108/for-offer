package linkedlist;

/**
 * author:DingwenDeng
 * Date:2018/9/6 10:12
 */
public class FindFirstCommonNode {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
        if(pHead1 == null || pHead2 == null)
            return null;
        int length1 = 0;
        int length2 = 0;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != null){
            p1 = p1.next;
            length1++;
        }
        while (p2 != null){
            p2 = p2.next;
            length2++;
        }
        if(length1 > length2){
            int len = length1 - length2;
            for(int i = 0; i < len; i++){
                pHead1 = pHead1.next;
            }
            while (pHead1 != null && pHead2 != null && pHead1 != pHead2){
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }else{
            int len = length2 - length1;
            for(int i = 0; i < len; i++){
                pHead2 = pHead2.next;
            }
            while(pHead1 != null && pHead2 != null && pHead1 != pHead2){
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }
        if(pHead1 == null || pHead2 == null)
            return null;
        else
            return pHead1;
    }
}