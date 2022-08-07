package com.rohan;

public class abcd_triangle {
    public static void main(String args[]){
       int n=1,k;

       //outer loop
        for(int i=4; i>=n; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(k=i-1; k>=1; k-- )
                System.out.print(k);
            System.out.println();
        }

    }
}
