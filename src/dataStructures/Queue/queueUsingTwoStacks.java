package dataStructures;

import java.util.*;

public class queueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();

        while(n-->0){
            int type = sc.nextInt();
            if(type==1){
                int x = sc.nextInt();
                q.add(x);
            }else if(type==2){
                q.remove();
            }else{
                System.out.println(q.peek());
            }
        }
    }
}
