package com.rohan;
import java.util.Scanner;
public class prime_numbers {
     void checkingPrime(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
            if(count==2){
                System.out.println(n);
            }
     }
  public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int f= 1000;
        prime_numbers obj=new prime_numbers();
        for(int j=1; j<=f; j++){
             obj.checkingPrime(j);
        }
  }
}
