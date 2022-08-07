package com.rohan;
import java.util.Scanner;

public class gc {

    public static void prime(int a){
        if (a<=0){
            System.out.println("INVALID NUMBER");
            return;
        }
        int i;
        for(i =2;  i<a; i++){

        }

        if (a%i==0){
            System.out.println("NUMBER IS NOT A PRIME. ");
        }
        else {
            System.out.println("NUMBER IS A PRIME.");
        }
        return;
    }

    public static void evenOdd(int a){
        if (a<=0){
            System.out.println("INVALID NUMBER");
            return;
        }
        else if(a%2==0){
            System.out.println("NUMBER IS EVEN.");
        }
        else {
            System.out.println("NUMBER IS ODD.");
        }
        return;
    }
    public static void table(int a){
        if (a<=0){
            System.out.println("INVALID NUMBER");
            return;
        }
        else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(a * i);
            }
        }
        return;
    }

    public static void main ( String args[]){
        int a, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("NUMBER");
        a=sc.nextInt();

        System.out.println("Write 1 to check number is prime or not.");
        System.out.println("Write 2 to check number is even or odd.");
        System.out.println("Write 3 to print table of the number.");
        num=sc.nextInt();

        switch (num){
            case 1:
                prime(a);
                break;
            case 2:
                evenOdd(a);
                break;
            case 3:
                table(a);
                break;
            default:
                System.out.println("INVALID CHOICE.");
        }
    }
}
