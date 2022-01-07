package dataStructures.LinkedLists;
import java.util.*;

//UNSOLVED
public class AllOne {
    static class all {

        LinkedList<String> keys = new LinkedList<String>();
        LinkedList<Integer> vals = new LinkedList<Integer>();
        int max = -1;
        int mn = 9999999;
        int mxind = -1;
        int mnind = -1;
        public all() {

        }
        public void inc(String key) {
            if(keys.contains(key)){
                int in = keys.indexOf(key);
                vals.set(in,vals.get(in)+1);
                if(vals.get(in)>max){
                    max=vals.get(in);
                    mxind = in;
                }
                if(mnind==in){
                    mn+=1;
                    getMinK();
                }
            }else{
                keys.add(key);
                vals.add(1);
                if(max==-1){
                    max=1;
                    mxind=0;
                    mn=1;
                    mnind=0;
                }
                if(1<mn){
                    mn = 1;
                    mnind = keys.indexOf(key);
                }
            }
        }

        public void dec(String key) {
            int in = keys.indexOf(key);
            if(vals.get(in)==1){
                keys.remove(key);
                vals.remove(in);
                if(in==mxind){
                    mxind = 0;
                }
                if(in==mnind){
                    mn=9999999;
                    getMinK();
                }
                if(mnind>keys.size()){
                    getMinK();
                }
                if(mxind>keys.size()){
                    max=-1;
                    getMaxK();
                }
                return;
            }
            vals.set(in,vals.get(in)-1);
            if(in==mxind){
                max = max-1;
                getMaxK();
            }
            if(in==mnind){
                mn=mn-1;
            }
            if(vals.get(in)<mn){
                mn = vals.get(in);
                mnind = in;
            }

        }
        private void getMaxK(){
            for (int i=0;i<vals.size();i++){
                int j = vals.get(i);
                if(j>max){
                    max=j;
                    mxind = i;
                }
            }
        }
        private void getMinK(){
            for (int i=0;i<vals.size();i++){
                int j = vals.get(i);
                if(j<mn){
                    mn=j;
                    mnind = i;
                }
            }
        }

        public String getMaxKey() {
            if(keys.size()==0) return "";
            return keys.get(mxind);
        }

        public String getMinKey() {
            if(keys.size()==0) return "";
            return keys.get(mnind);
        }
    }
    public static void main(String[] args) {
        all allOne = new all();
        allOne.inc("a");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        allOne.dec("b");
        allOne.dec("b");
        System.out.println(allOne.getMinKey());
        allOne.dec("a");
        System.out.println(allOne.getMaxKey());
        System.out.println(allOne.getMinKey());
    }
}
