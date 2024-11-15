package main.java.aboutList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Elinizde List<List<Integer>> yapısında bir koleksiyon olduğunu düşünün. Bu yapı
içindeki tüm alt listeleri tek bir List<Integer> haline getirmek istiyorsunuz.
Bu işlemi mümkün olduğunca kısa ve performanslı bir şekilde yapın.
flatMap yöntemi, List<List<Integer>> yapısını alıp içindeki her alt listeyi açarak
tek bir List<Integer> yapısına dönüştürür.
 */
public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<>();

        listOfLists.add(Arrays.asList(1,2,9));
        listOfLists.add(Arrays.asList(9,4,6));
        listOfLists.add(Arrays.asList(0,-2,3));

        //Tüm alt listeleri birleştirip tek liste oluşturma
        List<Integer> mergedList = listOfLists.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("Merged list: " + mergedList);

    }
}
