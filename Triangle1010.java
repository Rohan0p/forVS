package com.rohan;

public class Triangle1010 {
    public static void main(String args[]){
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/
        // Taking variable
        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                //if i+j is equal to even number then print 1.
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                //else print 0.
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
