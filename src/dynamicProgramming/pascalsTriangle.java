package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<>(numRows);
        for (int i=0;i<numRows;i++){
            a.add(new ArrayList(numRows));
            for (int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    a.get(i).add(1);
                }else{
                    a.get(i).add(a.get(i-1).get(j-1)+a.get(i-1).get(j));
                }
            }
        }
        a.remove(0);
        return a;
    }
    public static void main(String[] args) {
        List<List<Integer>> a = generate(5);
        for (List<Integer> i:a){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
