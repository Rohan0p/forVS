package com.rohan;
import java.util.*;
 public class fabonic_series {
    public static void main(String[] rohan) {
//        taking vairables
        double x = 0, y = 1, n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        double z =0;
        double fuck=0;

//        If you want to use while then this code will work.
        while(z<=n){
            System.out.print (z+",");
            x=y;
            y=z;
            z=x+y;

       }


    }
}
