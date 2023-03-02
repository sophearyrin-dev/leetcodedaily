import linkedlist.Node;

public class MergeTwoSortedLinkedList {

    public class ListNode{
        int val;
        ListNode next;

        public ListNode(){}
        public ListNode(int val){
            this.val = val;
        }

        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (l1 != null && l2!=null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
            }else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if(l1 !=null) tail.next = l1;
        else tail.next = l2;

        return dummy.next;
    }

}
