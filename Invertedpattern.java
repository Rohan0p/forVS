package com.rohan;
import java.util.*;
public class Invertedpattern{
    public static void main(String Args[]){
//        Inverted triangle
        int a;
        int n=1;
        int t=10,h=20;
        Scanner sc= new Scanner(System.in);
       a= sc.nextInt();
    // outer loop
        for(int i=1; i<=a; i++){
          //  Inner loop for space print only
            for(int j=1; j<=a-i; j++ ){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
           // Inner loop for pattern
            for(int j=1; j<=i; j++){
            System.out.print(j);

            }
            System.out.println();
        }

    }
}
