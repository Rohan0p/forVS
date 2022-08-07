package com.rohan;
import java.util.*;
public class pattern_123 {
    public static void main(String Args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        int n=1;
//        outer loop
        for(int i = a; i>=1; i--){
//            inner loop
            for(int j= 1; j<=i; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
