package com.rohan;
import java.util.Scanner;
public class oPPP {
    void natural(int n){
        for(int i=1; i<=10; i++) {
            int multi= i*n;
            System.out.println(i+"*"+n+"="+multi);
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    oPPP few= new oPPP();
    few.natural(n);

    }

}
