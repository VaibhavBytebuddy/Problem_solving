package problem_solving.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {

        //my code but not satisfy all aproches
        String s="paper",t="title";

        if(s.length()!=t.length())
        {
            System.out.println( "no isomorphic");
        }

        Map<Character, Character> map =new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();


        int i=0;
        while(i<s.length())
        {
            map.put(s.charAt(i),t.charAt(i));
            map2.put(t.charAt(i),s.charAt(i));

            i++;
        }
        System.out.println(map2+ " " +map2.size());
        System.out.println(map+ " "+map.size());

        if(map2.size()==map.size())
        {
            System.out.println("Isomorphic");
        }


        //ChatGBT code

//
//                String s = "paper", t = "title";
//
//                if (s.length() != t.length()) {
//                    System.out.println("Not Isomorphic");
//                    return;  // Exit if lengths are different
//                }
//
//                HashMap<Character, Character> mapS2T = new HashMap<>();
//                HashMap<Character, Character> mapT2S = new HashMap<>();
//
//                for (int i = 0; i < s.length(); i++) {
//                    char ch1 = s.charAt(i);
//                    char ch2 = t.charAt(i);
//
//                    // If already mapped, but not to the same character, return false
//                    if (mapS2T.containsKey(ch1) && mapS2T.get(ch1) != ch2) {
//                        System.out.println("Not Isomorphic");
//                        return;
//                    }
//                    if (mapT2S.containsKey(ch2) && mapT2S.get(ch2) != ch1) {
//                        System.out.println("Not Isomorphic");
//                        return;
//                    }
//
//                    // Store the mapping
//                    mapS2T.put(ch1, ch2);
//                    mapT2S.put(ch2, ch1);
//                }
//
//                System.out.println("Isomorphic");
//





    }
}
