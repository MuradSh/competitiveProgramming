package dataStructures.LinkedLists;

import java.util.ArrayList;
import java.util.List;

public class LL141 {
    public static boolean hasCycle(ListNode head) {
        List<ListNode> a = new ArrayList<ListNode>();

        while(head!=null){
            if(a.contains(head)) return true;
            a.add(head);
            head = head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);
        h.next = h2;
        h2.next = h3;
        h3.next = h4;
        h3.next = h;
        h4.next = h5;

        System.out.println(hasCycle(h));
    }
}
