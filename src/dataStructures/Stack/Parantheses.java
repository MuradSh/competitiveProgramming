package dataStructures.Stack;
import java.util.Stack;

public class Parantheses {
    public static boolean isValid(String s) {
        if(s.length()<=1) return false;
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.add(c);
            }else{
                if(st.size()==0) return false;
                char en = st.pop();
                if(en=='(' && c!=')'){
                    return false;
                }else if(en=='[' && c!=']'){
                    return false;
                }else if(en=='{' && c!='}'){
                    return false;
                }
            }
        }
        if(st.size()!=0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("({})"));
    }
}
