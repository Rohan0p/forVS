package com.rohan;
//hollow rectangle not in syllabus. only for fun.
import java.util.*;
public class table {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
//       Hollow rectangle
        int r=5;
        int col=5;
//        Outer loop
        for (int i=1; i<=r;i++){
            for (int j=1; j<=col; j++){
                if(i==1 || i==r || j==1 || j==col){
                    System.out.print("*");

                }
                    else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
