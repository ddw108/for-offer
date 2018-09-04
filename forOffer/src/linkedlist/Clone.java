package linkedlist;

public class Clone {

    private void CloneList(RandomListNode pHead){
        RandomListNode pNode = pHead;
        while (pNode!=null){
            RandomListNode newNode = new RandomListNode(pNode.label);
            newNode.random = null;
            newNode.next = pNode.next;
            pNode.next = newNode;
            pNode = newNode.next;
        }
    }

    private void CloneRandom(RandomListNode pHead){
        RandomListNode pNode = pHead;
        while (pNode != null){
            if(pNode != null){
                pNode.next.random = pNode.random.next;
            }
            pNode = pNode.next.next;
        }
    }

    private RandomListNode DivClone(RandomListNode pHead){
        RandomListNode pNode = pHead;
        RandomListNode cHead = pNode;
        RandomListNode cNode = pNode;
        if(pNode != null){
            cHead = pNode = pHead.next;
            pNode.next = cNode.next;
            pNode = pNode.next;
        }
        while (pNode != null){
            cNode.next = pNode.next;
            cNode = cNode.next;
            pNode.next = cNode.next;
            pNode = pNode.next;
        }
        return cHead;
    }

    public RandomListNode Clone(RandomListNode pHead){
        CloneList(pHead);
        CloneRandom(pHead);
        return DivClone(pHead);
    }
}
