package dataStructures;

import java.util.Scanner;
import java.util.Stack;

class maximumElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        Stack<Node> st = new Stack<Node>();
        while(n-->0){
            int type = sc.nextInt();
            if(type==1){
                int x = sc.nextInt();
                if(max==Integer.MIN_VALUE){
                    max = x;
                }
                if(x>max){
                    max = x;
                }
                st.push(new Node(x,max));
            }else if(type==2){
                int popped = st.pop().data;
                if(st.empty()){
                    max = Integer.MIN_VALUE;
                }else{
                    max = st.peek().maxTillNow;
                }
            }else{
                System.out.println(st.peek().maxTillNow);
            }
        }
    }
    static class Node{
        int data;
        int maxTillNow;
        Node(int data,int maxTillNow){
            this.data = data;
            this.maxTillNow = maxTillNow;
        }
    }
}

