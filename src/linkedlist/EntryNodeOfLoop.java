package linkedlist;

public class EntryNodeOfLoop {

    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null)
            return null;
        ListNode fastNode = pHead.next.next;
        ListNode slowNode = pHead.next;
        while(fastNode != slowNode){
            if(fastNode == null || fastNode.next == null)
                return null;
            else{
                fastNode = fastNode.next.next;
                slowNode = slowNode.next;
            }
        }
        fastNode = pHead;
        while (fastNode!=slowNode){
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        return fastNode;
    }
}
