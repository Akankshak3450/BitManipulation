package com.company;

import java.util.Scanner;
import java.util.Stack;

public class CountTotalSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        countSetBits(N);
    }
    public static int countSetBits(int N){
//        int sum=0;
//        Stack<Integer> s = new Stack<>();
//        for (int i = 1; i <= N; i++) {
//            int j =i;
//            while(j>0){
//                int g = j%2;
//                s.push(g);
//                j = j/2;
//            }
//            while(!s.isEmpty()){
//                int f = s.pop();
//                if(f ==1){
//                    sum++;
//                }
//            }
//        }
//        System.out.println("\n"+sum);
//        return sum;
//

        /*    Another solution ............... */
        int sum=0;
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= N; i++) {
            int j =i;
            while(j>0){
                if(j%2==1){
                    sum++;

                }
                j = j>>1;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
