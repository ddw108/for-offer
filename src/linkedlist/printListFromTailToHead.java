package linkedlist;

import java.util.ArrayList;

public class printListFromTailToHead {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> result = new ArrayList<>();
        if(listNode == null)
            return result;
        ListNode temp1 = null;
        ListNode temp2 = null;
        while (listNode!=null){
            temp2 = listNode;
            listNode = listNode.next;
            temp2.next = temp1;
            temp1 = temp2;
        }
        while (temp2 != null){
            result.add(temp2.val);
            temp2 = temp2.next;
        }
        return result;
    }
}
