package com.rohan;
import java.util.Scanner;
public class trigangle {
    public static void main(String args []){
        //taking variable
        int n = 4;
        Scanner sc = new Scanner (System.in);
        System.out.println("Give input");
        //logic
        // Outer loop
        for(int i=1; i<=n; i++ ){
            // Inner loop for spaces
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");

            }
            //Outer loop for stars;
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
