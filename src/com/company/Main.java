package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int b = 5;
        int a = b>>1;
        // '>>' = '/' is divide operation
        // '<<' = '*' is multiply operation
        System.out.println(b+" "+a);
*/
        /*
        // To find odd or even using BM
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if((n&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }*/

        // Swap two numbers using BM
        int s= sc.nextInt();
        int d = sc.nextInt();
        s = s^d;
        d =s^d;
        s = s^d;
        System.out.println(s+"  "+d);
    }
}
