package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class equalStacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        Stack<Node> st = new Stack<Node>();
        Stack<Node> st2 = new Stack<Node>();
        Stack<Node> st3 = new Stack<Node>();
        int sum=0;
        int sum2=0;
        int sum3=0;
        int minSum = Integer.MAX_VALUE;
        ArrayList<Integer> inputArray = new ArrayList<Integer>();

        for (int i=0;i<n1;i++){
            int v = sc.nextInt();
            sum+=v;
            inputArray.add(v);
        }
        Collections.reverse(inputArray);
        for (int i=0;i<n1;i++){
            st.push(new Node(inputArray.get(i)));
        }
        inputArray.clear();

        for (int i=0;i<n2;i++){
            int v = sc.nextInt();
            sum2+=v;
            inputArray.add(v);
        }
        Collections.reverse(inputArray);
        for (int i=0;i<n2;i++){
            st2.push(new Node(inputArray.get(i)));
        }

        inputArray.clear();
        for (int i=0;i<n3;i++){
            int v = sc.nextInt();
            sum3+=v;
            inputArray.add(v);
        }
        Collections.reverse(inputArray);
        for (int i=0;i<n3;i++){
            st3.push(new Node(inputArray.get(i)));
        }

        minSum = Integer.min(Integer.min(sum,sum2),sum3);

        while(sum2!=sum3 || sum2!=sum){
            if(sum2==0 || sum3==0 || sum==0){
                sum2=0;
                break;
            }
            if(minSum==sum2){
                if(sum3!=sum2)
                    sum3-=st3.pop().data;
                if(sum!=sum2)
                    sum-=st.pop().data;
            }else if(minSum==sum3){
                if(sum3!=sum2)
                    sum2-=st2.pop().data;
                if(sum3!=sum)
                    sum-=st.pop().data;
            }else{
                if(sum3!=sum)
                    sum3-=st3.pop().data;
                if(sum2!=sum)
                    sum2-=st2.pop().data;
            }
            minSum=Integer.min(sum3,Integer.min(sum2,sum));
        }
        System.out.println(sum2);
    }
}

/*
5 3 4
3 2 1 1 1
4 3 2
1 1 4 1


3 3 3
100 10 10
10 10 10
5 5 5
*/







class Node{
    int data;
    Node(int data){
        this.data = data;
    }
}