package com.rohan;
import java.util.Scanner;
public class methods {
    int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    void prinFactors(int n){
        for(int j= 1; j<n; j++){
            if(n%j==0){
                System.out.println(j);
            }
        }
        return;
    }

    void printFactors(int i) {
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                System.out.println(j);
            }
        }
    }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        methods obj = new methods();
        int a= sc.nextInt();
        switch(a) {
            case 1:
                for ( int i = 1; i <= n; i++) {
                    obj.printFactors(i);
                }
                break;
            case 2:
                int fact = obj.factorial(n);
                System.out.println(fact);
                break;
            case 3:
                obj.prinFactors(n);
                break;
            default:
                System.out.println("Maa chuda");
        }


    }

}
