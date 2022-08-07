package com.rohan;
import java.util.*;
public class factorial {
    public static void main(String args[]){
        int a;
//        Taking double for long floating value.
        double fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get factorial");
//        Taking number from user to give him the factorial of that number.
        a=sc.nextInt();
//      code to use for loop.
       /* for(int i=a; i>=1; i--){
            fact=fact*i;
        }
        System.out.println(fact);*/
//        doing with while loop
        while(a>1){
//           logic = 5*fact and fact value become 5 from 1 and then 4*fact
//            now fact is 5 so, 5*4 and so on.
            fact=fact*a;
            a--;
        }
//        printing the last fact digit which is factorial.
        System.out.println("This is your factorial"+fact);

    }
}
