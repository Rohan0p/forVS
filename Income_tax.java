package com.rohan;
import java.util.*;
public class Income_tax {
    public static void main(String args[]) {
        int age;
        Double income, tax;
        char gender;
        Scanner sc = new Scanner(System.in);
//        Taking necessary input from user.
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter F if you are female;");
        System.out.println("Enter M if your are male");
        gender = sc.next().charAt(0);
        System.out.println(gender);
//        Using if statement and else if statement.
        if (gender == 'F' || age > 65) {
            System.out.println("Wrong category");
        }
            else{
                System.out.println("Enter your Income");
                income = sc.nextDouble();
                if (income < 160000) {
                    System.out.println("Nil");

                } else if ( income >= 160000 && income <= 500000) {
                    tax = (income - 160000) * 0.1;
                    System.out.println("You have to pay this " + tax);

                }
                else if(income >= 500000 && income<=800000 ){
                    tax= (income-500000)*0.2+34000;
                    System.out.println("You have to pay this "+ tax);
                }
                    else{
                        tax= (income-800000)*0.3 + 94000;
                    System.out.println("You have to pay this " + tax);
                }

            }
        }


    }
