package main.java.aboutSet;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c: str.toCharArray()) set.add(c);
        StringBuilder sb = new StringBuilder();
        for(char c: set) sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(removeDuplicates(str));
    }
}
