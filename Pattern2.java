package com.rohan;

public class Pattern2 {
    public static void main(String args[]) {
/*        Q. Draw a pattern like this
         ABCDE
         BCDE
         CDE
         DE
         E
  */
//        Outer loop
        int t = 0;
        for(char i = 'A'; i<='E'; i++){
//            Inner loop

            for (char c=i; c<='E'; c++){

                System.out.print(c);
            }
            System.out.println();
        }
    }

}
