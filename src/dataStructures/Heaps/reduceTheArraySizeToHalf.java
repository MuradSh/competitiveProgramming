package dataStructures.Heaps;

import java.util.*;
import java.util.stream.Collectors;

public class reduceTheArraySizeToHalf {

    public static int minSetSize(int[] arr) {
        int requiredSize = arr.length/2;

        int[] counts = new int[arr.length];
        Set<Integer> s =  Arrays.stream(arr).boxed().collect(Collectors.toSet());
        List asList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int i=0;
        for(int occ: s){
            counts[i] = Collections.frequency(asList,occ);
            i++;
        }
        Arrays.sort(counts);
        counts = Arrays.stream(counts)
                .filter(val -> val != 0)
                .toArray();
        for(int occ: counts){
            System.out.println(occ);
        }
        return 0;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b) -> b-a);

        q.add(1);
        q.add(11);
        q.add(-11);
        q.add(131);
        q.add(411);
        q.add(511);
        q.add(-1431);
        q.add(0);
        q.remove(511);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
//        int[] a = {3,3,3,3,5,5,5,2,2,7};
//        minSetSize(a);
    }
}

//511
//        411
//        131
//        11
//        1
//        0
//        -11
//        -1431
