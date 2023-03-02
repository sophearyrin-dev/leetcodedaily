//https://leetcode.com/problems/is-subsequence/?envType=study-plan&id=level-1
public class isSubsequence {

    public static boolean isSubsequence(String s, String t){

        int i =0, j = 0;
        while(i< s.length() && j< t.length()){
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            j++;
        }
        if(i == s.length()) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";

        System.out.println(isSubsequence(s,t));
    }
}
