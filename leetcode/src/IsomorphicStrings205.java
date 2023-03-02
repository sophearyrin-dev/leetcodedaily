import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/?envType=study-plan&id=level-1
public class IsomorphicStrings205 {

//    public static boolean isIsomorphic(String s, String t){
//
//        //check edge case
//        if (s == null || t == null || s.length() != t.length()){
//            return false;
//        }
//
////        Extended ASCII is a version that supports representation of 256 different characters.
//        int m1[] = new int[256]; //Extended Ascii
//        int m2[] = new int[256];
//
//        int n = s.length();
//        for(int i=0; i<n; i++){
//            char c1 = s.charAt(i);
//            char c2 = t.charAt(i);
//
//            //check if character of s point to different value
//            if(m1[c1] !=m2[c2]){
//                return false;
//            }
//            m1[c1] = i+1;
//            m2[c2] = i+1;
//        }
//        return true;
//    }

    //using hasmap
    public static boolean isIsomorphic(String s, String t){
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(Integer i = 0; i <s.length(); i ++) {
            if(map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i))
            {
                System.out.println("workd?" + map1.put(s.charAt(i), i));
                System.out.println(map2.put(s.charAt(i), i));
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {

        String s = "egg";
        String t = "air";
        System.out.println(IsomorphicStrings205.isIsomorphic(s,t));

        //Example
        char w = s.charAt(0);
        int y[] = new int[256];
        System.out.println("what? = " + y[w]); //0
    }

}
