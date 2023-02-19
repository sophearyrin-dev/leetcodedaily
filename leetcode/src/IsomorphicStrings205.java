//https://leetcode.com/problems/isomorphic-strings/?envType=study-plan&id=level-1
public class IsomorphicStrings205 {

    public static boolean isIsomorphic(String s, String t){

        //check edge case
        if (s == null || t == null || s.length() != t.length()){
            return false;
        }

//        Extended ASCII is a version that supports representation of 256 different characters.
        int m1[] = new int[256]; //Extended Ascii
        int m2[] = new int[256];

        int n = s.length();
        for(int i=0; i<n; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            //check if character of s point to different value
            if(m1[c1] !=m2[c2]){
                return false;
            }
            m1[c1] = i+1;
            m2[c2] = i+1;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";
        System.out.println(IsomorphicStrings205.isIsomorphic(s,t));

        //Example
        char w = 'a';
        int y[] = new int[256];
        System.out.println("asdkjflakdsf = " + y['a']); //0
//        System.out.println('b' + y['b']); //98
    }

}
