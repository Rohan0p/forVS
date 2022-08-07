package com.rohan;
import java.util.*;
public class Main {

    public static void main(String[] args) {
// Q.1-Write a program to print inverted triangle pattern.
        int a;
            Scanner sc= new Scanner(System.in);
           a= sc.nextInt();
//            outer loop
        for(int i = a; i>=1; i--){
            for(int j= 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
