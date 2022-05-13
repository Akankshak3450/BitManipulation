package com.company;

import java.util.Scanner;
import java.util.Stack;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        setBits(N);
    }
    static int setBits(int N) {
        Stack<Integer> s = new Stack<>();
        int count=0;
        while(N>0){
            int y = N%2;
            s.push(y);
            N=N/2;
        }
        while(!s.isEmpty()){
            int c = s.pop();
            System.out.print(c);
            if(c ==1){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
