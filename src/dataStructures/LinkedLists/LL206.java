package dataStructures.LinkedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LL206 {
    public static ListNode reverseList(ListNode head) {
        if(head==null) return null;
        List<Integer> a = new ArrayList<Integer>();
        while(head!=null){
            a.add(head.val);
            head = head.next;
        }
        ListNode h = new ListNode(a.get(a.size()-1));
        ListNode ret = h;
        for(int i=a.size()-2;i>=0;i--){
            h.next = new ListNode(a.get(i));
            h = h.next;
        }
        return ret;
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
        h4.next = h5;
        ListNode a = reverseList(h);
    }
}
