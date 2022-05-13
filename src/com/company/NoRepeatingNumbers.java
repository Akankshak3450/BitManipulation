package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NoRepeatingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }

    }
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int index=0;
        int[] single = new int[0];
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                single[index++] = nums[i];
            }
        }
        for (int i = 0; i < single.length; i++) {
            System.out.println(single[i]+"  ");
        }
        return nums;
    }
}
