package main.java.aboutMap;

import java.util.HashMap;
import java.util.Map;

/*
Bir sınıfta, öğrencilerin farklı derslerden aldığı puanları saklamak için bir Map
yapısı kullanmak istiyorsunuz. Her öğrenciye bir id verilmiş ve her dersin bir adı var.
 Yapı, öğrenci ID’si ve ders adı kombinasyonunu kullanarak öğrencinin puanını
 sorgulamanıza imkan tanımalı. Bu yapıyı nasıl oluşturabilirsiniz?
 */
public class MapSolution {
    public static void main(String[] args) {
        Map<StudentGrade, Integer> grades = new HashMap<>();

        grades.put(new StudentGrade(101, "Math"), 85);
        grades.put(new StudentGrade(102, "Science"), 90);
        grades.put(new StudentGrade(102,"Biology"), 78);

        // puan sorgulama:
        StudentGrade key = new StudentGrade(101,"Math");
        System.out.println("Puan: " + grades.getOrDefault(key, 0));
    }
}
