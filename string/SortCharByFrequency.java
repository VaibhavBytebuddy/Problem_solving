package problem_solving.string;

import java.util.*;

public class SortCharByFrequency {


    public static void main(String[] args) {

        //String s="eeebbbbaa";
          String s="tree";
          //String s="cccaaa";
          //String s="Aabb";
        char[] charArray = s.toCharArray();
        Hashtable<Character,Integer> ht=new Hashtable();
        for (char ch:charArray)
        {
            ht.put(ch,ht.getOrDefault(ch, 0) + 1);
        }



        // Step 2: Convert Hashtable entries into a List
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(ht.entrySet());

        // Step 3: Sort List by frequency in descending order
        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Step 4: Build the output string
        StringBuilder sortedString = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedString.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        // Step 5: Print the final sorted string
        System.out.println("Sorted by frequency: " + sortedString.toString());












        }
    }



