package dataStructures.Heaps;

import java.util.*;

public class kWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> weaks = new HashMap<Integer,Integer>();
        List<Integer> w1 = new ArrayList<Integer>();
        int ind = 0;
        for(int[] a: mat){
            int weakness = 0;
            for(int b: a){
                if(b==1){
                    weakness++;
                }else{
                    break;
                }
            }
            weaks.put(ind,weakness);
            w1.add(weakness);
            ind++;
        }
        Collections.sort(w1);
        List<Integer> ret = new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            int weakness = w1.get(i);
            int keyV = 0;
            for(int key: weaks.keySet()){
                if(weaks.get(key)==weakness){
                    ret.add(key);
                    keyV = key;
                    break;
                }
            }
            weaks.remove(keyV);
        }
        return ret.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {

    }
}
