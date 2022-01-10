package dynamicProgramming;

public class isSubsequence {

    public static boolean isSubsequence(String s, String t) {
        for(int i=0;i<t.length();i++){
            if(s.length()==0) return true;
            if(t.charAt(i)==s.charAt(0)){
                s = s.substring(1);
            }
        }
        return s.length()==0;
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence("ace","abecd"));
        System.out.println(isSubsequence("ace","abcde"));
        System.out.println(isSubsequence("","abecd"));
        System.out.println(isSubsequence("",""));
        System.out.println(isSubsequence("a",""));
    }
}
