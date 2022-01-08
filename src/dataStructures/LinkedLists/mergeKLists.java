package dataStructures.LinkedLists;

import java.util.Arrays;

public class mergeKLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        mergeSort(lists);
        return lists[0];
    }

    public static void mergeSort(ListNode[] lists){
        if(lists.length>=2){
            ListNode[] left = Arrays.copyOfRange(lists, 0, lists.length/2);
            ListNode[] right = Arrays.copyOfRange(lists, lists.length/2,
                    lists.length);
            System.out.println(lists.length);
            for(ListNode a: left){
                System.out.println(a.val);
            }
            mergeSort(left);
            mergeSort(right);
            merge(lists,lefdt,right);
        }
    }


    public static void merge(ListNode[] lists,ListNode[] left,ListNode[] right){
        int i1=0;
        int i2=0;
        for(int i=0;i<lists.length;i++){
            if(i2>=right.length || (i1< left.length && left[i1].val<=right[i2].val)){
                lists[i] = left[i1];
                i1++;
            }else{
                lists[i] = right[i2];
                i2++;
            }
        }
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


        ListNode a = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(45);
        ListNode a5 = new ListNode(555);
        a.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        ListNode[] az = {h,a};
        ListNode z = mergeKLists(az);
        System.out.println();
        while(z!=null){
            System.out.println(z.val);
            z = z.next;
        }
    }

}
