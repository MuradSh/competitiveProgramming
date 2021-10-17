package dataStructures;

import java.util.*;

public class queue1 {
    public static int func(int a, int b)
    {
        if (b==1)
            return a;
        else
            return a + func(a+1,b-1);
    }

    public static void main(String[] args) {
        System.out.println(func(2,3));
    }
}
