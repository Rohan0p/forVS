package com.rohan;
import java.util.*;
public class usingFunctions {
    public static void fact(int a){

        int facto=1;
        for(int i =a; i>=1; i--){
            facto = facto*i;
        }
        System.out.println(facto);

       return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=5;
     fact(a);



    }

}
