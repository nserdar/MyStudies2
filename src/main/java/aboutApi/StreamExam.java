package main.java.aboutApi;

import java.util.Arrays;
import java.util.List;

// Bir List<Integer>’deki çift sayıları filtreleyip, her birinin karesini alan bir program yazınız.
public class StreamExam {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3,2,6,9,1);

        List<Integer> res = integerList.stream()
                .filter(s -> s % 2 == 0)
                .map(u -> u*u)
                .toList();

        System.out.println("Result : " + res);
    }
}
