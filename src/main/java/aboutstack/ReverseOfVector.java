package main.java.aboutstack;

import java.util.Arrays;

public class ReverseOfVector {
    public static void main(String[] args) {
        int[] sayilar = {1,2,3,4,5};
        reverseOfVector(sayilar, 0, sayilar.length-1);
    }

    public static void reverseOfVector(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
