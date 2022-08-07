 package com.rohan;
import java.util.Scanner;

public class leapyear {
    public static int Y=10;

    public static void main(String args[]){
       int y;
        Scanner sc= new Scanner(System.in);
        y=sc.nextInt();
        if (y%100==0 && y%400==0 || y%100==0 && y%4==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }

    }

}
