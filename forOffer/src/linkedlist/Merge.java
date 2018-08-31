package linkedlist;

public class Merge {

    public ListNode Merge(ListNode list1,ListNode list2){
        ListNode mergeList;
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        if(list1.val > list2.val){
            mergeList = list2;
            mergeList.next = Merge(list1, list2.next);
        }else{
            mergeList = list1;
            mergeList.next = Merge(list1.next, list2);
        }
        return mergeList;
    }
}
