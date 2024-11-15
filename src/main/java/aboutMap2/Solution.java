package main.java.aboutMap2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String sentence = "Programming with java";

        // Harf sayısını tutmak için map
        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch: sentence.toCharArray()){
            if (Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                //eğer harf daha önce eklendiyse sayısını artır
                frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
