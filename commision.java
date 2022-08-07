package com.rohan;
import java.util.*;
public class commision {
    public static void main (String args[]) {
//        declaring variables
        double comm, inc, book;
//        Taking necessary input from user.
        System.out.println("Commision");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your book sale");
        inc = sc.nextDouble();
//        Using if and else if statement.
        if (inc >= 100000) {
            comm=inc*0.25;
            System.out.println(comm + " this is your commission");
        }
        else if (inc>=80000){
            comm=inc*0.225;
            System.out.println(comm+" This is your commision ");
        }
        else if (inc>=60000){
            comm=inc*0.2;
            System.out.println(comm + "This is your commission");
        }
        else if (inc>=40000){
            comm=inc*0.15;
            System.out.println(comm + " This is your commission");
        }
        else {
            comm=inc*0.125;
            System.out.println(comm+" This is your commission");
        }
    }

}
