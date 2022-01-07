package dataStructures.LinkedLists;

import java.util.*;

public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a;
        if(l1.val<=l2.val){
            a = new ListNode(l1.val);
            l1 = l1.next;
        }else{
            a = new ListNode(l2.val);
            l2 = l2.next;
        }
        while(l1!=null && l2!=null){
            if(l1==null){
                a.next = new ListNode(l1.val);
                l2 = l2.next;
                continue;
            }
            if(l2==null){
                a.next = new ListNode(l2.val);
                l1 = l1.next;
                continue;
            }
            if(l1.val<=l2.val){
                a.next = new ListNode(l1.val);
                l1 = l1.next;
                continue;
            }
            if(l1.val>l2.val){
                a.next = new ListNode(l2.val);
                l2 = l2.next;
                continue;
            }
        }
        return a;
    }
    public static void main(String[] args) {

    }
}
